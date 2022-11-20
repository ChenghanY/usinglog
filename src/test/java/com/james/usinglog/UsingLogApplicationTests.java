package com.james.usinglog;

import com.james.usinglog.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * 数据库初始化脚本：
 *
 * CREATE TABLE `test` (
 *   `id` int(11) NOT NULL,
 *   `hello` varchar(255) DEFAULT NULL,
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 *
 */
@SpringBootTest
class UsingLogApplicationTests {

	@Autowired
	private TestMapper testMapper;
	@Test
	void MyBatisMapperTest() {
		testMapper.insert(1, "xxxx");
		testMapper.update(1, "yyy");
		testMapper.findHelloById(1);
		testMapper.delete(1);
	}

}
