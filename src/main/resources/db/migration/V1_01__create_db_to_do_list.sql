CREATE TABLE `task`(
    `id` long NOT NULL,
    `description` varchar(50) NOT NULL,
    `date` timestamp NULL DEFAULT NULL,
    `user_task_id` int NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `user`(
    `id` long NOT NULL,
    `first_name` varchar(30) NOT NULL,
    `last_name` varchar(30) NOT NULL,
    `user_task_id` int NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `user_task`(
    `id` long NOT NULL,
    `user_id` int NOT NULL,
    `task_id` int NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `user_task` ADD CONSTRAINT `FK_user_task_task` FOREIGN KEY (`task_id`) REFERENCES `task`(`id`);
ALTER TABLE `user_task` ADD CONSTRAINT `FK_user_task_user` FOREIGN KEY (`user_id`) REFERENCES `user`(`id`);



