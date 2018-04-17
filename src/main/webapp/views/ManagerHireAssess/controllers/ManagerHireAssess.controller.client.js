
angular.module("weProApp")
  .controller("ManagerHireAssess", function() {
    var ctrl = this;
    
    var forms = [
      "form1.tpl.html",
    ];
    
    ctrl.displayedForms = [];
    
    ctrl.addForm = function(formIndex) {
      ctrl.displayedForms.push(forms[formIndex]);
    }
  });