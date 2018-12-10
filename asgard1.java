var output1 = init.step(stateVector1);
var action1 = output1.intValue();
//perform action1 in the environment
// get reward and new state
var output2 = output1.next(reward).step(stateVector2);
//....
output2.done(finalReward);
