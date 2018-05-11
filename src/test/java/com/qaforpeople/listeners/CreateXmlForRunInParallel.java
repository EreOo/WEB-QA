package com.qaforpeople.listeners;


import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.testng.IAlterSuiteListener;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;
import java.util.*;

public class CreateXmlForRunInParallel implements IAlterSuiteListener {
    private static Set<Method> allTestsInProject;
    private static final String PATH_WITH_TESTS = "com.qaforpeople.functionality.tests";

    @Override
    public void alter(List<XmlSuite> suites) {
        if (!suites.isEmpty()) {
            XmlSuite modifySuite = suites.get(0);
            List<XmlTest> xmlTestList = new ArrayList<>();
            Map<String, String> allTestClasses;

                allTestClasses = getAllTestClasses(getAllTests());

            for (Map.Entry<String, String> entry : allTestClasses.entrySet()) {
                XmlTest xmlTest = new XmlTest(modifySuite);
                XmlClass xmlClass = new XmlClass(entry.getValue());
                xmlTest.setClasses(Collections.singletonList(xmlClass));
                xmlTest.setName(entry.getKey());
                xmlTestList.add(xmlTest);
            }
            modifySuite.setTests(xmlTestList);

            //TODO get property from pom.xml now it's hardcode.
            modifySuite.setThreadCount(1);

            System.out.println(modifySuite.toXml());
        }
    }

    private static Set<Method> getAllTests() {
        if (allTestsInProject == null) {
            Reflections reflections = new Reflections(PATH_WITH_TESTS, new MethodAnnotationsScanner());
            allTestsInProject = reflections.getMethodsAnnotatedWith(Test.class);
        }
        return allTestsInProject;
    }

    private static Map<String, String> getAllTestClasses(Set<Method> methodSet) {
        Map<String, String> classNameAndPathMap = new HashMap<>();
        for (Method testMethod : methodSet) {
            List<String> groups = Arrays.asList(testMethod.getAnnotation(Test.class).groups());

            /**
             * Need Allure for this.
             * And groups. (include/exclude)
             */
//            Issue issue = testMethod.getAnnotation(Issue.class);
//            Issues issues = testMethod.getAnnotation(Issues.class);
//            if ((issue != null || issues != null) && !WITH_BUG) {
//                continue;
//            }

//            if (groups.containsAll(SELENIUM_SETTINGS.getIncludedGroups()) && !isContainsExcludedGroup(groups)) {
//                String classPath = testMethod.getDeclaringClass().getName();
//                if (!classNameAndPathMap.containsValue(classPath)) {
//                    classNameAndPathMap.put(testMethod.getName(), classPath);
//                }


                String classPath = testMethod.getDeclaringClass().getName();
                if (!classNameAndPathMap.containsValue(classPath)) {
                    classNameAndPathMap.put(testMethod.getName(), classPath);
                }
            }
        return classNameAndPathMap;
    }
}

