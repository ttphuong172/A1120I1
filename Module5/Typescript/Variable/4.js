var message;
var total = 100;
var isProduction = true;
var prices = [120, 88, 60];
var languages = ['vi', 'en-us'];
var now = new Date();
var unknown;
var Direction;
(function (Direction) {
    Direction[Direction["UP"] = 0] = "UP";
    Direction[Direction["DOWN"] = 1] = "DOWN";
    Direction[Direction["LEFT"] = 2] = "LEFT";
    Direction[Direction["RIGHT"] = 3] = "RIGHT";
})(Direction || (Direction = {}));
;
function log(msg) {
    console.log(msg);
}
isProduction = false;
unknown = Direction.UP;
unknown = 'changed';
var post = {
    id: "a",
    title: "Nguyen Van A"
};
message = "50";
