/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Kamalion
 * Created: May 2, 2018
 */

DELETE FROM `carx`.`sync_info`;
DELETE FROM `carx`.`activity`;
DELETE FROM `carx`.`user`;
DELETE FROM `carx`.`country`;


INSERT INTO `carx`.`user` (`userName`) VALUES ('Petrov');
INSERT INTO `carx`.`user` (`userName`) VALUES ('Ivanov');
INSERT INTO `carx`.`user` (`userName`) VALUES ('Sergeev');
INSERT INTO `carx`.`user` (`userName`) VALUES ('Hose');
INSERT INTO `carx`.`user` (`userName`) VALUES ('Jhonson');
INSERT INTO `carx`.`user` (`userName`) VALUES ('Todd');

INSERT INTO `carx`.`country` (`code`, `name`) VALUES ('RU', 'Russia');
INSERT INTO `carx`.`country` (`code`, `name`) VALUES ('US', 'United States');
INSERT INTO `carx`.`country` (`code`, `name`) VALUES ('CU', 'Cuba');

INSERT INTO `carx`.`sync_info` (`id`, `date`, `money`, `newUser`, `country_code`, `user_id`) VALUES ('2', '2018-01-05 17:22:22', '2000', true, 'RU', 'Petrov');
INSERT INTO `carx`.`sync_info` (`id`, `date`, `money`, `newUser`, `country_code`, `user_id`) VALUES ('3', '2018-01-05 18:20:00', '300', false, 'CU', 'Hose');
INSERT INTO `carx`.`sync_info` (`id`, `date`, `money`, `newUser`, `country_code`, `user_id`) VALUES ('4', '2018-01-05 19:20:00', '800', false, 'US', 'Jhonson');
INSERT INTO `carx`.`sync_info` (`id`, `date`, `money`, `newUser`, `country_code`, `user_id`) VALUES ('5', '2018-01-05 20:50:00', '900', false, 'RU', 'Sergeev');
INSERT INTO `carx`.`sync_info` (`id`, `date`, `money`, `newUser`, `country_code`, `user_id`) VALUES ('6', '2018-01-05 23:10:00', '5000', true, 'US', 'Todd');

INSERT INTO `carx`.`activity` (`id`, `activity`, `date`, `user_id`) VALUES ('1', '80', '2018-02-05 17:00:00', 'Ivanov');
INSERT INTO `carx`.`activity` (`id`, `activity`, `date`, `user_id`) VALUES ('2', '100', '2018-02-05 17:20:00', 'Petrov');
INSERT INTO `carx`.`activity` (`id`, `activity`, `date`, `user_id`) VALUES ('3', '150', '2018-02-05 18:30:00', 'Ivanov');
INSERT INTO `carx`.`activity` (`id`, `activity`, `date`, `user_id`) VALUES ('4', '160', '2018-02-05 17:00:00', 'Ivanov');


