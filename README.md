# Petstore

[![CI](https://gitlab.com/Daria-malakhova/petstore/badges/main/pipeline.svg)](https://gitlab.com/Daria-malakhova/petstore/-/commits/main)

- Run tests locally
```mvn clean verify``` - will default to QA environment

- Check report
After the tests are run a report is generated. The report link is displayed at the end of the log.
file://projects_folder/target/site/serenity/index.html. The link can be opened in a browser. 

The report will contain information about:
-Features that were tested
-Scenarios for every Feature
-Test Result for each Scenario
-the logged request and response, with all details

- Run in CI
The CI pipeline was created in GitLab.

The overview of all the runs is available here https:https://gitlab.com/Daria-malakhova/petstore/-/pipelines
For each run the Test Report is saved and stored for 30 days. The report can be downloaded locally or browsed directly in GitLab.

- Issues
application returns StatusCode 200 even when it should not. Because of this most of the positive and negative test will fail the StatusCode check.

- How to add new tests
Add a new Feature file/or add new Scenarios to existing feature file.
Extract common functionality in Step Libraries.
Write new test Scenarios in Gherkin
Automate the scenario steps using Java
