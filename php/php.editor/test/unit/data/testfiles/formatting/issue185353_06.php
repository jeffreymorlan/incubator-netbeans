<?php
 
$browser->info('1 - The homepage')->
get('/')->
with('request')->begin(array(
"test"
))->
setValidators(array(
"name" => new sfValidatorString(array('required' => true), array(
"required" => "Tato položka je povinná",
"invalid" => "Tato položka byla špatně vyplněna")),
"text" => new sfValidatorString(array('required' => true), array(
"required" => "Tato položka je povinná",
"invalid" => "Tato položka byla špatně vyplněna")),
))->
isParameter('module', 'job')->
isParameter('action', 'index')->
end()->
with('response')->begin()->
info(' 1.1 - Expired jobs are not listed')->
checkElement('.jobs td.position:contains("exired")', false)->
end();

?>