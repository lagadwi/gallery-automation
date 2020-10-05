# Gallery Automation
Gallery Automation is a Automation using Katalon Studio and it's easy to run test suites and test cases.

## Installation
1. Sign Up and Install Katalon Studio
https://www.katalon.com/download/
2. install Android Studio for using ADV(Android Virtual Device)
https://developer.android.com/studio

## Usage
RUN TEST SUITE
1. Open this project on Katalon Studio
2. Start ADV on Android studio, if there is no device, create one
3. Put apk file on gallery-automation\androidapp and rename it to "app-release.apk"
4. Open include>features>Shopping.feature, block entire lines press  right click recalculate steps or press f5
5. Open Test Suites>EndToEndTest, Run test suite using android device

ADD MORE TEST SUITE
1. Create new BDD in include>feature
2. Glue BDD with scripts
3. Call feature in new Test 
4. Add Test Case to Test Suite
