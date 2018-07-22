# use -port 9999 to use different port
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar  -sharedDb -inMemory -port 8000
