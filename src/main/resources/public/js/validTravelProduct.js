var app = angular.module("springDemo",['ui.bootstrap']);

app.controller("AppCtrl", function($scope,$http){
$scope.validTravelProduct =[];
$http.get("http://localhost:8099/api/validTravelProduct").then(function(response)
    {
    $scope.validTravelProduct = response.data;
    $scope.viewby = 10;
      $scope.totalItems = $scope.validTravelProduct.length;
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

     $scope.selectedValidTravelProduct = null;
     $scope.validTravelProductCopy = null;
       $scope.selectValidTravelProduct = function(validTravelProduct){
       $scope.selectedValidTravelProduct = validTravelProduct;
       $scope.validTravelProductCopy= angular.copy(validTravelProduct)
     }
     $scope.saveValidTravelProduct = function(validTravelProduct){
     $scope.selectedValidTravelProduct.OperatorCd = validTravelProduct.OperatorCd;
     }

    }
   );
});