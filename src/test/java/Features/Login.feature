Feature: Create Lead functionaloity in Leaftaps

    @smoke
    Scenario: Create Lead in Leaftaps
        Given Launch the browser
        And Load the URL
        And Enter the username as DemoSalesManager
        And Enter the password as crmsfa
        And Click on the Login button
        And Click on the CRM SFA link
        And Click on the Leads link
        And Click on the Create Lead link
        And Enter the Company Name as TestLeaf
        And Enter the First Name as Hema
        And Enter the Last Name as M
        And Click on the Create Lead button
        Then Verify the Lead is created successfully
        And Close the browser
        