# grails3
Exploring Grails and Groovy

### Instsallation
```
$ brew install groovy
$ brew install gradle
$ brew install grails
```

### Version
```
$ which grails
 | Grails Version: 3.1.8
 | Groovy Version: 2.4.6
 | JVM Version: 1.8.0_65
```
 
### Create Grails Application
```
$ grails create-app grails3 -profile=angular -profile=rest-api
```

### Use Eclipse IDE
```
http://grails.asia/grails-3-tutorial-setup-your-windows-development-environment
File->Import...->Gradle(STS)->Gradle(STS) Project
 	Build Model
```

### Demos
```
$ curl -XGET http://localhost:8080/employees
[]

$ curl -XPOST -d '{"name": "Ken Chen"}' http://localhost:8080/employees
{"total":2,"_embedded":{"errors":[{"message":"Property [name] of class [class grails3.Employees] cannot be null","path":"/employees/index","_links":{"self":{"href":"http://localhost:8080/employees/index"}}},{"message":"Property [company] of class [class grails3.Employees] cannot be null","path":"/employees/index","_links":{"self":{"href":"http://localhost:8080/employees/index"}}}]}}

$ curl -XPOST -H 'Content-Type:application/json' -d '{"name": "Ken Chen", "company": "Ericsson"}' http://localhost:8080/employees
{"id":1,"company":"Ericsson","name":"Ken Chen"}

$ curl -XPUT -H 'Content-Type:application/json' -d '{"name": "Ken Chen", "company": "Ericsson", "country": "US"}' http://localhost:8080/employees/1
{"id":1,"company":"Ericsson","name":"Ken Chen"}
 ```
