$(document).ready(function() {
CucumberHTML.timelineItems.pushArray([
  {
    "id": "75365478-408d-4978-9cfb-6536e3cbbd9d",
    "feature": "Demo feature",
    "scenario": "Title of your scenario",
    "start": 1598123780416,
    "end": 1598123788458,
    "group": 19,
    "content": "",
    "className": "failed",
    "tags": "@demofeature1,@tag1,"
  },
  {
    "id": "3003c98f-70d7-40e7-8b92-2cd4d4cff406",
    "feature": "Demo feature",
    "scenario": "Title of your scenario outline",
    "start": 1598123780416,
    "end": 1598123795440,
    "group": 21,
    "content": "",
    "className": "passed",
    "tags": "@demofeature1,@tag2,"
  },
  {
    "id": "88d8a8e0-8062-46cb-8a9a-d59482b4fc78",
    "feature": "Demo feature",
    "scenario": "Title of your scenario outline",
    "start": 1598123780415,
    "end": 1598123795442,
    "group": 20,
    "content": "",
    "className": "passed",
    "tags": "@demofeature1,@tag2,"
  }
]);
CucumberHTML.timelineGroups.pushArray([
  {
    "id": 19,
    "content": "Thread[TestNG-PoolService-0,5,main]"
  },
  {
    "id": 20,
    "content": "Thread[TestNG-PoolService-1,5,main]"
  },
  {
    "id": 21,
    "content": "Thread[TestNG-PoolService-2,5,main]"
  }
]);
});