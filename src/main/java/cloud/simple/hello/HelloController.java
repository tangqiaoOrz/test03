package cloud.simple.hello;

//import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import cloud.simple.domain.Person;

@RestController
//@RequestMapping("/test1")
public class HelloController {
  
  protected static Logger logger=LoggerFactory.getLogger(HelloController.class);
  
//  @Autowired
//  StringRedisTemplate stringRedisTemplate;
//  @Resource(name = "stringRedisTemplate")
//  ValueOperations<String, String> valOpsStr;
//  @Resource(name="redisTemplate")  
//  ValueOperations<Object,Object> valOps;  
  
  @RequestMapping("/")
  public String helloworld(){
    logger.debug("访问hello");
    return "Hello world!";
  }
  
  @RequestMapping("/hello/{name}")
  public String hellName(@PathVariable String name){
    logger.debug("访问helloName,Name={}",name);
    return"Hello"+name;
  }
  
  
  //ObjectRedisController的方法,由于异步调用会报错所以移到这边来测试,另外无法自动注册personDao也无法使用personDao,所以把dao里的东西全部移到这个页面了
//  @Autowired  
//  PersonDao personDao;  
    
//  @RequestMapping("/setPerson")  
//  public void set(String id,String name,Integer age){  
//      logger.debug("访问setPerson:id={},name={},age={}",id,name,age);  
//      Person person=new Person(id,name,age);  
////      personDao.save(person);  
//      valOps.set(person.getId(), person);
//  }  
//    
//  @RequestMapping("/getPerson")  
//  public Person getPerson(String id){  
////      return personDao.getPerson(id);  
//    return (Person) valOps.get(id);
//  }  
//  
//  
//  //StringRedisController的方法,由于异步调用会报错所以移到这边来测试
//  
//
//  
//
//  @RequestMapping("/set")
//  public String setKeyAndValue(String key, String value) {
//    logger.debug("访问set:key={},value={}", key, value);
//    valOpsStr.set(key, value);
//    return "Set Ok";
//  }
//
//  @RequestMapping("/get")
//  public String getKey(String key) {
//    logger.debug("访问get:key={}", key);
//    return valOpsStr.get(key);
//  }
  
  
}
