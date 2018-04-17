(function () {
    angular
        .module("weProApp")
        .config(configuration);

    function configuration($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "views/topic/templates/topic.view.client.html",
                controller: "TopicController",
                controllerAs: "model"
            })
            .when("/mhire", {
                templateUrl: "views/ManagerHireAssess/templates/ManagerHireAssess.view.client.html",
                controller: "TopicController",
                controllerAs: "model"
            })
            .otherwise({
                redirectTo: "/"
            });
    };
})();