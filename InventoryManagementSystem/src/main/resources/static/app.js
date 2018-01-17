var app = angular.module("imsApp", ["ui.router"]);

app.config(function($stateProvider, $urlRouterProvider, $locationProvider){
    $stateProvider.state('home', {
        templateUrl: 'pages/home.html',
    });

    //Products state
    $stateProvider.state('products', {
        url: '/viewProducts',
        templateUrl: 'pages/viewProducts.html'
    });

    //Purchase order state
    $stateProvider.state('purchaseOrder', {
        url: '/viewPurchaseOrder',
        templateUrl: 'pages/viewPurchaseOrder.html'
    });

    //Statistics State
    $stateProvider.state('statistics', {
        url: '/statistics',
        templateUrl: 'pages/viewStatistics.html'
    });

    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });

    $urlRouterProvider.otherwise('index');
});


//Home controller and services
//Home Controller gets the suppliers
app.controller('homeController', function ($scope, $state, $http) {
    $scope.infoSupplier = {};
        $http.get("/viewSupplier")
            .then(function (resp){
                $scope.infoSupplier = resp.data;
                console.log($scope.infoSupplier);
            }, function (error){
                console.log("There is an error")
            });
});

app.controller('retailController', function($scope, $state, $http){
    $scope.infoRetail = {};
        $http.get("/viewRetailer")
            .then(function(resp){
                $scope.infoRetail = resp.data;
                console.log($scope.infoRetail);
            }, function(error){
                console.log("There is an error")
            });
});

//Products Controller and service
app.controller('productController', function ($scope, $state, $http) {
    $scope.infoProds = {};
    $http.get("/viewProducts")
        .then(function (resp){
            $scope.infoProds = resp.data;
        }, function (error){
            console.log("There is an error")
        });
    console.log("Below httpGet");
});

//Purchase order Controller and service.
app.controller('purchaseOrderController', function ($scope, $state, $http) {
    $scope.infoPOC = {};
    $http.get("/viewPurchaseOrder")
        .then(function (resp){
            $scope.infoPOC = resp.data;
            console.log($scope.infoPOC);
        }, function (error){
            console.log("There is an error")
        });
});

//Sidebar Controller
app.controller("sidebarController", function($scope, $http, $state) {
    $scope.redirect = function(state){
        $state.go(state);
    }
});

//Statistics Controller and Service
app.controller('statisticsController', function ($scope, $state, $http) {
    $scope.infoStats = {};
    $http.get("/viewRetailer")
        .then(function (resp){
            //Get the retailers from the database
            $scope.retailers = resp.data;
            console.log('Retailers:');
            console.log($scope.retailers);

            //Create an array in the scope for all the statistics objects
            $scope.statsArray = [];

            //For each retailer,
            $scope.retailers.forEach(function(r){

                //Get all the Retailer sales for this retailer
                $http.get("/getSalesByRetailer/" + r.id)
                    .then(function (resp){
                        $scope.retailerSales = resp.data;
                        $scope.stat = {};

                        console.log("retailerSales:");
                        console.log($scope.retailerSales);

                        //Set the name of the stats object
                        $scope.stat.name = r.name;
                        $scope.stat.total = 0;
                        $scope.stat.year = 0;
                        $scope.stat.month = 0;

                        //Get a date for comparisons
                        var d = new Date();

                        //Iterate through the retailerSales
                        $scope.retailerSales.forEach(function(rs){
                            //Increment the total
                            $scope.stat.total = $scope.stat.total + rs.cost;

                            //Get the date of the retailerSales
                            var d2 = new Date(rs.date);

                            console.log("d: " + d);
                            console.log("d2: " + d2.getTime());

                            var diff = Math.abs(d - d2.getTime());
                            console.log(diff);
                            var days = diff / (1000 * 60 * 60 * 24);
                            console.log(days);
                            //Check/increment the year
                            if (days < 365){
                                $scope.stat.year = $scope.stat.year + rs.cost;
                            }

                            //Check/increment the month
                            if (days < 30){
                                $scope.stat.month = $scope.stat.month + rs.cost;
                            }
                        });

                        //Add the stats to the list of stats
                        $scope.statsArray.push($scope.stat);

                    }, function (error){
                       console.log("There is an error");
                    });
            });
        }, function (error){
            console.log("There is an error")
        });
});

app.controller("newPurchaseOrderController", function($scope, $state, $http){


});

// app.service("statisticsService", function () {
// var self = this;
//
//     self.getPurchaseOrder = function(){
//         var promise = $http({
//             method:"Get",
//             url:"/pages/viewStatistics"
//         }).then();
//
//     return {
//
//         }
//
//     };
//
// });