CREATE TABLE `user`(
    `id` bigint NOT NULL AUTO_INCREMENT,
    `first_name` varchar(30) NOT NULL,
    `last_name` varchar(30) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `task`(
    `id` bigint NOT NULL AUTO_INCREMENT,
    `description` varchar(50) NOT NULL,
    `date` timestamp NULL DEFAULT NULL,
    `user_id` bigint,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `user`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;







