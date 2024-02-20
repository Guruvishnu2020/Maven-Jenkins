Feature: Home Screen feature

Scenario:Load the Application
 Given Click on Google
 Then Page has to load
 When Enter a text
 Then Show list of search results

@First
 Scenario: Adding numbers in the Application
  Given get firstnumber
  Then get secondnumber
  When clicked plus button
  Then add firsttnumber and secondnumber

 @Second
 Scenario: Number subtraction in the Application
  Given get firstnumber
  Then get secondnumber
  When clicked minus button
  Then subtract secondnumber from firstnumber
