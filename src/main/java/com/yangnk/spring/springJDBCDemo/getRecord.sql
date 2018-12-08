DELIMITER $$
DROP PROCEDURE IF EXISTS `car`.`getRecord` $$
CREATE PROCEDURE `car`.`getRecord` (
IN in_id VARCHAR(100),
OUT out_engine VARCHAR(100),
OUT out_wheel  VARCHAR(100))
BEGIN
   SELECT engine, wheel
   INTO out_engine, out_wheel
   FROM car where id = in_id;
END $$
DELIMITER ;