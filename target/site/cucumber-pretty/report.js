$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DemoFeature1.feature");
formatter.feature({
  "name": "Demo feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DemoFeature1"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DemoFeature1"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "_1df1 I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_1df1 some other precondition",
  "keyword": "And "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.some_other_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_1df1 I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_1df1 some other action",
  "keyword": "And "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.some_other_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_1df1 yet another action",
  "keyword": "And "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.yet_another_action()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [false] but found [true]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertFalse(Assert.java:65)\n\tat org.testng.Assert.assertFalse(Assert.java:75)\n\tat org.suborg.project.teamname.stepdefinition.DemoFeature1Step.yet_another_action(DemoFeature1Step.java:49)\n\tat ✽._1df1 yet another action(file:///Users/smr1/Documents/AutomationTemplatePersonal/project/test-framework-template/src/test/resources/features/DemoFeature1.feature:29)\n",
  "status": "failed"
});
formatter.step({
  "name": "_1df1 I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_validate_the_outcomes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "_1df1 check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.check_more_outcomes()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "_2df1 I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "_2df1 I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "name": "_2df1 I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DemoFeature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "_2df1 I want to write a step with name1",
  "keyword": "Given "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step._2_i_want_to_write_a_step_with_name1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_2df1 I check for the 5 in step",
  "keyword": "When "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step._2i_check_for_the_in_step(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_2df1 I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_verify_the_in_step(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DemoFeature1"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "_2df1 I want to write a step with name2",
  "keyword": "Given "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step._2_i_want_to_write_a_step_with_name1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_2df1 I check for the 7 in step",
  "keyword": "When "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step._2i_check_for_the_in_step(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_2df1 I verify the Fail in step",
  "keyword": "Then "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_verify_the_in_step(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});