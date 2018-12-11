var app = angular.module("springDemo",['ui.bootstrap']);

app.controller("AppCtrl", function($scope,$http){
$scope.branches =[];
$http.get("http://localhost:8099/api/branchBudgetCtr").then(function(response)
    {
    $scope.branches = response.data;
    $scope.viewby = 10;
      $scope.totalItems = $scope.branches.length;
      $scope.currentPage = 1;
      $scope.itemsPerPage = $scope.viewby;
      $scope.maxSize = 5; //Number of pager buttons to show

      $scope.setPage = function (pageNo) {
        $scope.currentPage = pageNo;
      };

      $scope.pageChanged = function() {
        console.log('Page changed to: ' + $scope.currentPage);
      };

    $scope.setItemsPerPage = function(num) {
      $scope.itemsPerPage = num;
      $scope.currentPage = 1; //reset to first page
    }

     $scope.selectedBranch = null;
     $scope.branchCopy = null;
       $scope.selectBranch = function(branch){
       $scope.selectedBranch = branch;
       $scope.branchCopy= angular.copy(branch)
     }
     $scope.saveBranch = function(branch){
     $scope.selectedBranch.budgetCtrName = branch.budgetCtrName;
     }

    }
   );
});