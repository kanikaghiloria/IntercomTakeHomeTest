# IntercomTakeHomeTest

**Task**
We have some customer records in a text file (customers.txt) -- one customer per line, JSON
lines formatted. We want to invite any customer within 100km of our Dublin office for some food
and drinks on us. Write a program that will read the full list of customers and output the names
and user ids of matching customers (within 100km), sorted by User ID (ascending).

Distance between the locations / coordinates has to be calculated using haversine formula.

The GPS coordinates for our Dublin office are 53.339428, -6.257664.

Customer list cann be found at: https://s3.amazonaws.com/intercom-take-home-test/customers.txt 

**Pre-requisites**
1. Java version 13.0.2 -->
Check the version using command:

    _java -version_
2. Apache Maven version 3.6.3 --> Check the maven version using command:

    _mvn -version_
3. Make sure your JAVA-HOME and MAVEN-HOME variables are set.

**Cloning the project**
1. Install Git and git bash.
2. Open git bash.
3. Clone the project repository using command:

    _git clone https://github.com/kanikaghiloria/IntercomTakeHomeTest.git_

**Build, Test and Run the project**
1. Go to the root repository of the project i.e. /TakeHomeTest
2. Build the project using command:

    _mvn clean install_
    
    This command will also run the unit test cases.
3. Run the project using command:

    _java -cp target\TakeHomeTest-1.0-SNAPSHOT.jar org.intercom.customers.NearestCustomersApplication_
    
    List of users falling the range of 100 km from Dublin office will be displayed. 
    
    A text file containing the output will also be created. The already generated file is present at:
    
    _output.txt_
    
**Other Information**
1. Default values can be changed by editing Constants.java file present at:

    _src/main/java/org/intercom/customers/Constants.java_
     
    
    
 