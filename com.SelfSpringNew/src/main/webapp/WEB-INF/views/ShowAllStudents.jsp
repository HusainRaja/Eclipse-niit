<html>
   <head>
      <title>Show All</title>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
   </head>
   <body>
       <div ng-app="myApp" ng-controller="myCtrl">
          
          <table>
             <tr>
               <th>Sid</th>
               <th>Sname</th>
               <th>Mail ID</th>
               <th>Address</th> 
             </tr>
             <tr ng-repeat="record in myWelcome">
                <td>{{record.sid}}</td>
                <td>{{record.sname}}</td>
                <td>{{record.mailId}}</td>
                <td>{{record.address}}</td>
             </tr>
          </table>
       </div>
       <script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http.get("studentList")
  .then(function(response) {
      $scope.myWelcome = response.data;
  });
});
</script>
   </body>
</html>