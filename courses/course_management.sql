CREATE TABLE IF NOT EXISTS `users` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `teachers` (
  `phone` VARCHAR(255) NOT NULL,
  `experiences` INT(11) NULL DEFAULT 0,
  `user_id` INT(11) NOT NULL,
  INDEX `fk_teachers_users_idx` (`user_id` ASC) VISIBLE,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `fk_teachers_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `students` (
  `year` INT(11) NOT NULL,
  `user_id` INT(11) NOT NULL,
  INDEX `fk_students_users1_idx` (`user_id` ASC) VISIBLE,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `fk_students_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `courses` (
  `course_id` INT(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `location` VARCHAR(255) NOT NULL,
  `opened` DATETIME NOT NULL,
  PRIMARY KEY (`course_id`, `teacher_id`),
  INDEX `fk_courses_teachers1_idx` (`teacher_id` ASC) VISIBLE,
  CONSTRAINT `fk_courses_teachers1`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `mydb`.`teachers` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `enroll` (
  `user_id` INT(11) NOT NULL,
  `course_id` INT(11) NOT NULL,
  PRIMARY KEY (`user_id`, `course_id`),
  INDEX `fk_students_has_courses_courses1_idx` (`course_id` ASC) VISIBLE,
  INDEX `fk_students_has_courses_students1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_students_has_courses_students1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`students` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_students_has_courses_courses1`
    FOREIGN KEY (`course_id`)
    REFERENCES `mydb`.`courses` (`course_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
