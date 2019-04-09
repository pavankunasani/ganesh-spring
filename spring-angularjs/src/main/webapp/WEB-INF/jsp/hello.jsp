<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<body>
Hello ${name}
<div ng-app="myApp" ng-controller="myCtrl"> 

<h1>{{info.id}}</h1>
<h1>{{info.fistName}}</h1>
<h1>{{info.lastName}}</h1>
<h1>{{info.email}}</h1>
<h1>{{info.age}}</h1>

</div>



<script>
var app = angular.module('myApp', []);
console.log("call");
app.controller('myCtrl', function($scope, $http) {
  $http.get("/person/getInfo")
  .then(function(response) {
	  console.log(response.data);
      $scope.info = response.data;
  });
});
</script>

</body>
</html>
