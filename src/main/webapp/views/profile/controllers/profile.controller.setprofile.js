(function () {
    angular
        .module("weProApp")
        .controller("SetProfileController",profileController);

    function profileController(ProfileService) {
        var vm = this;
        vm.addTopic = addTopic;
        vm.updateProfile = updateProfile;


        function init() {

            vm.topics = undefined;
            // loadAllTopics();

            console.log("Hi, inside profile controller!! ")
        }

        init();

        function loadAllTopics() {
            ProfileService.getAllTopics()
                .then(function (topics) {
                    vm.topics = topics.data;
                });
        }

        function updateProfile(profile){
            console.log(profile);

            ProfileService.updateProfile(profile).then(function (status) {
                                                                      init();
                                                                  });
        }

        function addTopic(topic) {
            console.log(topic);

            ProfileService.addTopic(topic)
                .then(function (status) {
                    init();
                });
        }
    }
})();