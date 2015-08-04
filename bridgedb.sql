/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - bridge
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `bridge`;

USE `bridge`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `acti` */

DROP TABLE IF EXISTS `acti`;

CREATE TABLE `acti` (
  `NAME` varchar(100) default NULL,
  `ACTIVITY` varchar(100) default NULL,
  `PARAMETERS` varchar(100) default NULL,
  `VAL1` varchar(10) default NULL,
  `VAL11` varchar(11) default NULL,
  `VAL21` varchar(10) default NULL,
  `RECENT_VAL` varchar(10) default NULL,
  `NUMBER_OF_TIMES` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `acti` */

insert into `acti` (`NAME`,`ACTIVITY`,`PARAMETERS`,`VAL1`,`VAL11`,`VAL21`,`RECENT_VAL`,`NUMBER_OF_TIMES`) values ('a','sorting','sorting_time','0','99','2021','20245541','23'),('a','matching','matching_time','0','99','21','21','23'),('a','matching','matching_accuracy','0','99','21','21','23'),('a','i','i_i','0','0','0','044','4'),('a','i','i_i','0','0','0','044','4'),('a','g','g_h','0','0','0','0','1');

/*Table structure for table `actidyscalculia` */

DROP TABLE IF EXISTS `actidyscalculia`;

CREATE TABLE `actidyscalculia` (
  `NAME` varchar(100) default NULL,
  `ACTIVITY` varchar(100) default NULL,
  `PARAMETERS` varchar(100) default NULL,
  `VAL1` varchar(10) default NULL,
  `VAL11` varchar(11) default NULL,
  `VAL21` varchar(10) default NULL,
  `RECENT_VAL` varchar(10) default NULL,
  `NUMBER_OF_TIMES` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actidyscalculia` */

insert into `actidyscalculia` (`NAME`,`ACTIVITY`,`PARAMETERS`,`VAL1`,`VAL11`,`VAL21`,`RECENT_VAL`,`NUMBER_OF_TIMES`) values ('pppp','fdgfdg','fdgfdg_t','55','0','0','55mnbj','10'),('pppp','fdgfdg','fdgfdg_y','66','0','0','6456546','10'),('pppp','fdgfdg','fdgfdg_u','77','0','0','77i7869899','10');

/*Table structure for table `actidysgraphia` */

DROP TABLE IF EXISTS `actidysgraphia`;

CREATE TABLE `actidysgraphia` (
  `NAME` varchar(100) default NULL,
  `ACTIVITY` varchar(100) default NULL,
  `PARAMETERS` varchar(100) default NULL,
  `VAL1` varchar(10) default NULL,
  `VAL11` varchar(11) default NULL,
  `VAL21` varchar(10) default NULL,
  `RECENT_VAL` varchar(10) default NULL,
  `NUMBER_OF_TIMES` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actidysgraphia` */

insert into `actidysgraphia` (`NAME`,`ACTIVITY`,`PARAMETERS`,`VAL1`,`VAL11`,`VAL21`,`RECENT_VAL`,`NUMBER_OF_TIMES`) values ('cha','jhgkhjg','jhgkhjg_thdft','77687687','0','0','77687687','1');

/*Table structure for table `actidyslexia` */

DROP TABLE IF EXISTS `actidyslexia`;

CREATE TABLE `actidyslexia` (
  `NAME` varchar(100) default NULL,
  `ACTIVITY` varchar(100) default NULL,
  `PARAMETERS` varchar(100) default NULL,
  `VAL1` varchar(10) default NULL,
  `VAL11` varchar(11) default NULL,
  `VAL21` varchar(10) default NULL,
  `RECENT_VAL` varchar(10) default NULL,
  `NUMBER_OF_TIMES` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actidyslexia` */

insert into `actidyslexia` (`NAME`,`ACTIVITY`,`PARAMETERS`,`VAL1`,`VAL11`,`VAL21`,`RECENT_VAL`,`NUMBER_OF_TIMES`) values ('aa','s','s_e','03535','0','0','03535','1'),('aa','s','s_r','0','0','0','0','1');

/*Table structure for table `adhdsymptoms` */

DROP TABLE IF EXISTS `adhdsymptoms`;

CREATE TABLE `adhdsymptoms` (
  `NAME` varchar(50) default NULL,
  `adhd` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adhdsymptoms` */

/*Table structure for table `dyscalculiasymptoms` */

DROP TABLE IF EXISTS `dyscalculiasymptoms`;

CREATE TABLE `dyscalculiasymptoms` (
  `NAME` varchar(50) default NULL,
  `dyscalculia` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dyscalculiasymptoms` */

/*Table structure for table `dysgraphiasymptoms` */

DROP TABLE IF EXISTS `dysgraphiasymptoms`;

CREATE TABLE `dysgraphiasymptoms` (
  `NAME` varchar(50) default NULL,
  `dysgraphia` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dysgraphiasymptoms` */

insert into `dysgraphiasymptoms` (`NAME`,`dysgraphia`) values ('cha','Death grip on the pencil'),('cha','Incorrect pencil grip'),('cha','Awkward positioning of the body, bending too close '),('cha','the paper'),('cha','Symptoms of premature muscle fatigue'),('cha','Avoidance of writing tasks'),('cha','Death grip on the pencil'),('cha','Incorrect pencil grip'),('cha','Awkward positioning of the body, bending too close '),('cha','the paper'),('cha','Symptoms of premature muscle fatigue'),('cha','Avoidance of writing tasks'),('cha','Sparse written output inappropriate to a childs age, reading ability, verbal ability'),('cha','Numerous eye fixations from far to near point during a copying task'),('cha','Excessive number of erasures'),('cha','Frequent referral to an alphabet chart to check the formation of letters'),('cha','Confusions in directional orientation such as mirror writing and reversals'),('cha','Poor use of space as observed inc crawling or cramped writing, inadequate space between letters and words, inappropriate letter size relationships, and inability to stay within head and base lines'),('pp','Death grip on the pencil'),('pp','Incorrect pencil grip'),('pp','Awkward positioning of the body, bending too close '),('pp','the paper'),('pp','Symptoms of premature muscle fatigue'),('pp','Avoidance of writing tasks'),('pp','Sparse written output inappropriate to a childs age, reading ability, verbal ability'),('pp','Numerous eye fixations from far to near point during a copying task'),('pp','Excessive number of erasures'),('pp','Frequent referral to an alphabet chart to check the formation of letters'),('pp','Confusions in directional orientation such as mirror writing and reversals'),('pp','Poor use of space as observed inc crawling or cramped writing, inadequate space between letters and words, inappropriate letter size relationships, and inability to stay within head and base lines'),('pp','Poor letter connections and illegible letters'),('pp','Inaccuracies such as omissions, perseverations, lack of punctuation, line skipping'),('pp','Slow motor speed'),('pp','Hesitation and difficulty in generating letters in a noncopying writing task, particularly capital letters'),('pppp','Death grip on the pencil'),('pppp','Incorrect pencil grip'),('pppp','Awkward positioning of the body, bending too close '),('pppp','the paper'),('pppp','Symptoms of premature muscle fatigue'),('pppp','Avoidance of writing tasks'),('pppp','Sparse written output inappropriate to a childs age, reading ability, verbal ability'),('pppp','Numerous eye fixations from far to near point during a copying task'),('pppp','Excessive number of erasures'),('pppp','Frequent referral to an alphabet chart to check the formation of letters'),('pppp','Confusions in directional orientation such as mirror writing and reversals'),('pppp','Poor use of space as observed inc crawling or cramped writing, inadequate space between letters and words, inappropriate letter size relationships, and inability to stay within head and base lines'),('pppp','Poor letter connections and illegible letters'),('pppp','Inaccuracies such as omissions, perseverations, lack of punctuation, line skipping'),('pppp','Slow motor speed'),('pppp','Hesitation and difficulty in generating letters in a noncopying writing task, particularly capital letters'),('pppp','Problem in differentiating between sizes, shapes and quantities'),('pppp','Inability to do counting'),('pppp','Inability to understand place value'),('pppp','Difficulty with fundamental operations of addition, substraction, multiplication and division'),('pppp','No concept of fractions'),('pppp','Difficulty in telling time');

/*Table structure for table `dyslexiasymptoms` */

DROP TABLE IF EXISTS `dyslexiasymptoms`;

CREATE TABLE `dyslexiasymptoms` (
  `NAME` varchar(50) default NULL,
  `dyslexia` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dyslexiasymptoms` */

insert into `dyslexiasymptoms` (`NAME`,`dyslexia`) values ('a','Slow rate of oral and silent reading'),('a','Inability to answer questions about what is read showing lack of comprehension'),('a','Inability to state the main topic of a simple paragraph or story'),('a','Lack of skill in using tools to locate information and such as index and table of the contents'),('a','Inability to follow simple printed instructions'),('a','Reading word by word'),('a','Lack of expression in oral reading'),('a','Excessive lip movement in silent reading'),('a','Vocalization in silent reading'),('a','Lack of interest in reading'),('a',' Excessive physical activity while reading such as squirming'),('a','Mispronunciation of words'),('a','Omission of letters'),('a','Substitution of words / letters'),('a','Insertion of words / letters'),('a','Reversal of whole words due to difficulty in sequential memory'),('a','Repetition of words / groups when reading orally');

/*Table structure for table `familyhistory` */

DROP TABLE IF EXISTS `familyhistory`;

CREATE TABLE `familyhistory` (
  `NAME` varchar(50) default NULL,
  `Parenting` varchar(50) default NULL,
  `PARENTING_STYLE` varchar(50) default NULL,
  `PARENT_CHILD_RELATIONSHIP` varchar(50) default NULL,
  `PARENTAL_CRIMINALITY` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `familyhistory` */

insert into `familyhistory` (`NAME`,`Parenting`,`PARENTING_STYLE`,`PARENT_CHILD_RELATIONSHIP`,`PARENTAL_CRIMINALITY`) values ('hhh','Both parents working','Permissive parents','Neglect','ghghy'),('df','Both parents working','Authoritarian parents','Conducive relationship',''),('gf','Both parents working','Authoritarian parents','Neglect','gfgfgfg'),('cc','Single Parenting','Authoritarian parents','null','null'),('cc','Single Parenting','Authoritarian parents','null','null'),('cc','Single Parenting','Authoritarian parents','null','null'),('cc','Single Parenting','Authoritarian parents','null','null'),('dfds','Single Parenting','Democratic parents','Neglect','null'),('','null','Democratic parents','null',''),('fd','Single Parenting','Permissive parents','Verbal abuse',''),('g','Single Parenting','Authoritarian parents','null','null'),('pppp','null','Democratic parents','Domestic violence','');

/*Table structure for table `familystrength` */

DROP TABLE IF EXISTS `familystrength`;

CREATE TABLE `familystrength` (
  `NAME` varchar(50) default NULL,
  `strength` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `familystrength` */

insert into `familystrength` (`NAME`,`strength`) values ('hhh','One parent gainfully employed or having family business'),('hhh','Caring siblings'),('hhh','Family bilingual or multilingual'),('df','One parent gainfully employed or having family business'),('df','One parent gainfully employed or having family business'),('df','One parent gainfully employed or having family business'),('df','One parent gainfully employed or having family business'),('gf','One parent gainfully employed or having family business'),('gf','Support from extended family for any challenge or crisis'),('gf','Family resourceful'),('','Family resourceful'),('fd','One parent gainfully employed or having family business'),('pppp','Acceptance of the child?s condition in the larger family');

/*Table structure for table `generaldetails` */

DROP TABLE IF EXISTS `generaldetails`;

CREATE TABLE `generaldetails` (
  `NAME` varchar(50) default NULL,
  `DOB` varchar(20) default NULL,
  `SEX` varchar(15) default NULL,
  `AGEGROUP` varchar(25) default NULL,
  `ADDRESS` varchar(50) default NULL,
  `RESIDENCE` varchar(25) default NULL,
  `OFFICE` varchar(25) default NULL,
  `MOBILE` varchar(25) default NULL,
  `BOARD` varchar(25) default NULL,
  `MEDIUM` varchar(35) default NULL,
  `INCOME` varchar(25) default NULL,
  `MATHS` varchar(5) default NULL,
  `SOCIAL` varchar(5) default NULL,
  `SCIENCE` varchar(5) default NULL,
  `FIRSTLANGUAGE` varchar(5) default NULL,
  `SECONDLANGUAGE` varchar(5) default NULL,
  `THIRDLANGUAGE` varchar(5) default NULL,
  `FATHER_NAME` varchar(25) default NULL,
  `FATHER_OCCUPATION` varchar(25) default NULL,
  `FATHER_EDU` varchar(25) default NULL,
  `MOTHER_NAME` varchar(25) default NULL,
  `MOTHER_OCCUPATION` varchar(25) default NULL,
  `MOTHER_EDU` varchar(25) default NULL,
  `CARETAKER` varchar(25) default NULL,
  `TYPEOFDELIVARY` varchar(50) default NULL,
  `BIRTH_ASPHYXIA` varchar(50) default NULL,
  `AGE_THE_CHILD_HELD_NECK` varchar(50) default NULL,
  `AGE_THE_CHILD_SAT_WITH_SUPPORT` varchar(50) default NULL,
  `AGE_THE_CHILD_WALKED_WITH_SUPPORT` varchar(50) default NULL,
  `AGE_THE_CHILD_UTTERED_FIRST_WORDS` varchar(50) default NULL,
  `GROWTH` varchar(50) default NULL,
  `NEUROTIC_SYMPTOMS` varchar(50) default NULL,
  `ANY_PHYSICAL_ILLNESS_DURING_CHILDHOOD` varchar(50) default NULL,
  `ANY_EFFECT_OF_ILLNESS_ON_DEVELOPMENT` varchar(50) default NULL,
  `TYPE_OF_SPONTANEOUS_GAMES_DURING_CHILDHOOD` varchar(50) default NULL,
  `ADHD` varchar(20) default NULL,
  `DYSLEXIA` varchar(20) default NULL,
  `DYSGRAPHIA` varchar(20) default NULL,
  `DYSCALCULIA` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `generaldetails` */

insert into `generaldetails` (`NAME`,`DOB`,`SEX`,`AGEGROUP`,`ADDRESS`,`RESIDENCE`,`OFFICE`,`MOBILE`,`BOARD`,`MEDIUM`,`INCOME`,`MATHS`,`SOCIAL`,`SCIENCE`,`FIRSTLANGUAGE`,`SECONDLANGUAGE`,`THIRDLANGUAGE`,`FATHER_NAME`,`FATHER_OCCUPATION`,`FATHER_EDU`,`MOTHER_NAME`,`MOTHER_OCCUPATION`,`MOTHER_EDU`,`CARETAKER`,`TYPEOFDELIVARY`,`BIRTH_ASPHYXIA`,`AGE_THE_CHILD_HELD_NECK`,`AGE_THE_CHILD_SAT_WITH_SUPPORT`,`AGE_THE_CHILD_WALKED_WITH_SUPPORT`,`AGE_THE_CHILD_UTTERED_FIRST_WORDS`,`GROWTH`,`NEUROTIC_SYMPTOMS`,`ANY_PHYSICAL_ILLNESS_DURING_CHILDHOOD`,`ANY_EFFECT_OF_ILLNESS_ON_DEVELOPMENT`,`TYPE_OF_SPONTANEOUS_GAMES_DURING_CHILDHOOD`,`ADHD`,`DYSLEXIA`,`DYSGRAPHIA`,`DYSCALCULIA`) values ('a','457','Female','3-6','','','','',NULL,NULL,NULL,'','','','','','','','',NULL,'','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'YES','YES',NULL,NULL),('aa','5565','Female','6-10','','','','',NULL,NULL,NULL,'','','','','','','','',NULL,'','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'NO','YES',NULL,NULL),('zzzzzzz','','null','null','','','','','null','null','null','','','','','','','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null'),('cha','45','Female','3-6','','','','','null','null','null','','','','','','','','','null','','','null','null','null','null','null','null','null','null','null','null','null','null','null','NO','NO','YES','null'),('pp','','null','3-6','','','','','null','null','null','','','','','','','','','null','','','null','null','null','No','null','null','null','null','null','null','null','null','null','NO','NO','YES','null'),('pppp','','null','3-6','','','','','null','null','null','','','','','','','','','null','','','null','null','Instrumental','null','null','null','null','null','null','null','null','null','null','NO','NO','YES','YES'),('ss','','null','null','','','','','null','null','null','','','','','','','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null','null');

/*Table structure for table `health` */

DROP TABLE IF EXISTS `health`;

CREATE TABLE `health` (
  `NAME` varchar(50) default NULL,
  `Status` varchar(50) default NULL,
  `problems` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `health` */

insert into `health` (`NAME`,`Status`,`problems`) values ('hhh','Healthy','null'),('df','Healthy','null'),('df','Healthy','null'),('df','Healthy','null'),('df','Healthy','null'),('gf','Healthy','null'),('','Healthy','null'),('fd','Healthy','null'),('pppp','Healthy','null');

/*Table structure for table `informant` */

DROP TABLE IF EXISTS `informant`;

CREATE TABLE `informant` (
  `NAME` varchar(50) default NULL,
  `Informant` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `informant` */

insert into `informant` (`NAME`,`Informant`) values ('hhh','Mother'),('hhh','Father'),('df','Mother'),('gf','Mother'),('cc','Mother'),('dfds','Mother'),('qqqq','Mother'),('q','Mother'),('g','Mother'),('q','Mother'),('w','Mother'),('','Mother'),('','Mother'),('','Mother'),('fd','Mother'),('fd','Mother'),('cccccc','Mother'),('c1','Mother'),('g','Mother'),('jjk','Mother'),('qq1','Mother'),('www','Mother'),('q','Mother'),('ccc','Mother'),('a','Mother'),('a','Mother'),('aa','Mother'),('cha','Mother'),('pp','Mother'),('pppp','Mother');

/*Table structure for table `mental` */

DROP TABLE IF EXISTS `mental`;

CREATE TABLE `mental` (
  `NAME` varchar(50) default NULL,
  `problems` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mental` */

insert into `mental` (`NAME`,`problems`) values ('hhh','Alcoholism'),('df','Alcoholism'),('df','Alcoholism'),('df','Alcoholism'),('df','Alcoholism'),('gf','Depression'),('','Alcoholism'),('fd','Alcoholism'),('pppp','Alcoholism');

/*Table structure for table `mentor` */

DROP TABLE IF EXISTS `mentor`;

CREATE TABLE `mentor` (
  `NAME` varchar(50) default NULL,
  `PASSWORD` varchar(15) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mentor` */

insert into `mentor` (`NAME`,`PASSWORD`) values ('b','b');

/*Table structure for table `observation` */

DROP TABLE IF EXISTS `observation`;

CREATE TABLE `observation` (
  `NAME` varchar(50) NOT NULL,
  `B1` varchar(10) default NULL,
  `T1` varchar(100) default NULL,
  `B2` varchar(10) default NULL,
  `T2` varchar(100) default NULL,
  `B3` varchar(10) default NULL,
  `T3` varchar(100) default NULL,
  `B4` varchar(10) default NULL,
  `T4` varchar(100) default NULL,
  `B5` varchar(10) default NULL,
  `T5` varchar(100) default NULL,
  `B6` varchar(10) default NULL,
  `T6` varchar(100) default NULL,
  `B7` varchar(10) default NULL,
  `T7` varchar(100) default NULL,
  `B8` varchar(10) default NULL,
  `T8` varchar(100) default NULL,
  `B9` varchar(10) default NULL,
  `T9` varchar(100) default NULL,
  `B10` varchar(10) default NULL,
  `T10` varchar(100) default NULL,
  PRIMARY KEY  (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `observation` */

insert into `observation` (`NAME`,`B1`,`T1`,`B2`,`T2`,`B3`,`T3`,`B4`,`T4`,`B5`,`T5`,`B6`,`T6`,`B7`,`T7`,`B8`,`T8`,`B9`,`T9`,`B10`,`T10`) values ('a','GOOD','','MEDIOCRE','','BAD','','a','','a','','a','','a','','a','','a','','a',''),('ab','MEDIOCRE','jjj','MEDIOCRE','lll','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q','MEDIOCRE','q');

/*Table structure for table `otherprobs` */

DROP TABLE IF EXISTS `otherprobs`;

CREATE TABLE `otherprobs` (
  `NAME` varchar(50) default NULL,
  `otherprobs` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `otherprobs` */

insert into `otherprobs` (`NAME`,`otherprobs`) values ('hhh','Keeps running out of class'),('hhh','Irritates other students'),('df','Keeps running out of class'),('gf','Keeps running out of class'),('cc','Keeps running out of class'),('dfds','Comes shabbily to school'),('qqqq','Keeps running out of class'),('qqqq','Irritates other students'),('q','Comes shabbily to school'),('g','Keeps running out of class'),('q','Keeps running out of class'),('w','Keeps running out of class'),('','Comes shabbily to school'),('','Comes shabbily to school'),('','Keeps running out of class'),('fd','Makes lots of spelling mistakes'),('fd','Comes shabbily to school'),('cccccc','Keeps running out of class'),('c1','Keeps running out of class'),('g','Makes lots of spelling mistakes'),('jjk','Keeps running out of class'),('qq1','Keeps running out of class'),('www','Keeps running out of class'),('q','Keeps running out of class'),('ccc','Keeps running out of class'),('a','Irritates other students'),('a','Keeps running out of class'),('aa','Keeps running out of class'),('cha','Keeps running out of class'),('pp','Keeps running out of class'),('pppp','Keeps running out of class');

/*Table structure for table `psychologist` */

DROP TABLE IF EXISTS `psychologist`;

CREATE TABLE `psychologist` (
  `NAME` varchar(50) default NULL,
  `PASSWORD` varchar(15) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psychologist` */

insert into `psychologist` (`NAME`,`PASSWORD`) values ('a','a'),('b','b');

/*Table structure for table `psydetails` */

DROP TABLE IF EXISTS `psydetails`;

CREATE TABLE `psydetails` (
  `NAME` varchar(25) default NULL,
  `SEX` varchar(15) default NULL,
  `QUALIFICATION` varchar(35) default NULL,
  `AOS` varchar(25) default NULL,
  `ADDRESS` varchar(130) default NULL,
  `MOBILE` varchar(15) default NULL,
  `EMAIL` varchar(35) default NULL,
  `Why_Psychology` varchar(210) default NULL,
  `WANT_TO_DO_AS_Psy` varchar(210) default NULL,
  `Intervention` varchar(210) default NULL,
  `Training` varchar(210) default NULL,
  `Further_Training` varchar(210) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psydetails` */

insert into `psydetails` (`NAME`,`SEX`,`QUALIFICATION`,`AOS`,`ADDRESS`,`MOBILE`,`EMAIL`,`Why_Psychology`,`WANT_TO_DO_AS_Psy`,`Intervention`,`Training`,`Further_Training`) values ('a','Male','a','s','s','s','s','s','s','s','s','s'),('q','null','q','','','','','','','','',''),('g','Female','g','h','h','h','hh','h','h','h','',''),('chandana','Female','j','j','j','j','j','j','j','j','j','j');

/*Table structure for table `psyexperience` */

DROP TABLE IF EXISTS `psyexperience`;

CREATE TABLE `psyexperience` (
  `Name` varchar(50) default NULL,
  `Exp` varchar(25) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psyexperience` */

insert into `psyexperience` (`Name`,`Exp`) values ('a','Self-brief of work'),('a','Projects'),('a','Assignments done'),('q','Self-brief of work'),('g','Assignments done'),('chandana','Projects');

/*Table structure for table `psyinterest` */

DROP TABLE IF EXISTS `psyinterest`;

CREATE TABLE `psyinterest` (
  `Name` varchar(50) default NULL,
  `Interest` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psyinterest` */

insert into `psyinterest` (`Name`,`Interest`) values ('a','Child'),('a','Adolescent'),('q','Marital'),('g','Child'),('chandana','De-addiction');

/*Table structure for table `psyquestions` */

DROP TABLE IF EXISTS `psyquestions`;

CREATE TABLE `psyquestions` (
  `NAME` varchar(50) default NULL,
  `Q1` varchar(250) default NULL,
  `Q2` varchar(250) default NULL,
  `Q3` varchar(250) default NULL,
  `Q4` varchar(250) default NULL,
  `Q5` varchar(250) default NULL,
  `Q6` varchar(250) default NULL,
  `Q7` varchar(250) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psyquestions` */

insert into `psyquestions` (`NAME`,`Q1`,`Q2`,`Q3`,`Q4`,`Q5`,`Q6`,`Q7`) values ('hhh','hjhg','fhfg','fgf','fgfg','ggfd','gfd','gd'),('df','jk','j','j','j','j','j','j'),('df','jk','j','j','j','j','j','j'),('df','jk','j','j','j','j','j','j'),('df','jk','j','j','j','j','j','j'),('gf','v','d','s','s','s','s','s'),('','','','','','','',''),('fd','','','','','','',''),('pppp','y','y','y','y','y','y','y');

/*Table structure for table `reasonsreferred` */

DROP TABLE IF EXISTS `reasonsreferred`;

CREATE TABLE `reasonsreferred` (
  `NAME` varchar(50) default NULL,
  `reasonsreferred` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `reasonsreferred` */

insert into `reasonsreferred` (`NAME`,`reasonsreferred`) values ('hhh','Poor academic performance'),('hhh','Disturbs the class'),('df','Poor academic performance'),('gf','Poor academic performance'),('cc','Poor academic performance'),('dfds','Does not complete homework'),('qqqq','Poor academic performance'),('q','Poor academic performance'),('g','Poor academic performance'),('q','Poor academic performance'),('w','Poor academic performance'),('','Poor academic performance'),('','Change of school or stream for poor performance'),('','Does not complete homework'),('fd','Poor academic performance'),('fd','Does not complete homework'),('cccccc','Poor academic performance'),('c1','Poor academic performance'),('g','Disturbs the class'),('jjk','Poor academic performance'),('qq1','Poor academic performance'),('www','Does not complete homework'),('q','Change of school or stream for poor performance'),('ccc','Poor academic performance'),('a','Poor academic performance'),('a','Disturbs the class'),('aa','Poor academic performance'),('cha','Language exemption'),('pp','Change of school or stream for poor performance'),('pppp','Poor academic performance');

/*Table structure for table `referred` */

DROP TABLE IF EXISTS `referred`;

CREATE TABLE `referred` (
  `NAME` varchar(50) default NULL,
  `referred` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `referred` */

insert into `referred` (`NAME`,`referred`) values ('hhh','School'),('hhh','Neighbour'),('df','Grandparent'),('gf','School'),('cc','School'),('dfds','School'),('qqqq','School'),('q','School'),('g','School'),('q','School'),('w','School'),('','School'),('','Neighbour'),('','School'),('fd','School'),('fd','School'),('cccccc','School'),('c1','School'),('g','School'),('jjk','School'),('qq1','School'),('www','School'),('q','School'),('ccc','School'),('a','School'),('a','School'),('aa','School'),('cha','School'),('pp','School'),('pppp','School');

/*Table structure for table `regexperience` */

DROP TABLE IF EXISTS `regexperience`;

CREATE TABLE `regexperience` (
  `Name` varchar(50) default NULL,
  `Exp` varchar(25) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `regexperience` */

/*Table structure for table `reginterest` */

DROP TABLE IF EXISTS `reginterest`;

CREATE TABLE `reginterest` (
  `Name` varchar(50) default NULL,
  `Interest` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `reginterest` */

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `NAME` varchar(25) default NULL,
  `SEX` varchar(15) default NULL,
  `QUALIFICATION` varchar(35) default NULL,
  `AOS` varchar(25) default NULL,
  `ADDRESS` varchar(130) default NULL,
  `MOBILE` varchar(15) default NULL,
  `EMAIL` varchar(35) default NULL,
  `Why_Psychology` varchar(210) default NULL,
  `WANT_TO_DO_AS_Psy` varchar(210) default NULL,
  `Work_done` varchar(210) default NULL,
  `Intervention` varchar(210) default NULL,
  `Training` varchar(210) default NULL,
  `Further_Training` varchar(210) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `registration` */

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
