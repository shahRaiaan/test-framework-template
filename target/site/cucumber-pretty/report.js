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
  "status": "passed"
});
formatter.step({
  "name": "_1df1 I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "_1df1 check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "org.suborg.project.teamname.stepdefinition.DemoFeature1Step.check_more_outcomes()"
});
formatter.result({
  "status": "passed"
});
});