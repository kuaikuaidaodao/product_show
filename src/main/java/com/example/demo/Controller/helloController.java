package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;

@Controller
@RequestMapping("/hello")
//@CacheConfig(cacheNames = "kitty")
public class helloController {
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @Autowired
//    private IuserinfoService iuserinfoService;
//@Value("${application.hello:Hello Angel}")
//
//private String hello;
//    @Autowired
//    private IUserinfoRepository iUserinfoRepository;
//    @Autowired
//    private UserRepository userRepository;
//    private volatile int value;

//    private String hello;

//    @Bean
//    public ViewResolver getViewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }
//    @RequestMapping(value = "helloJsp")
//    public ModelAndView getListaUtentiView(){
//        ModelAndView model = new ModelAndView("helloJsp");
//        model.addObject("name", "Spring Boot");
//        return model;
//    }
//    @Value("${application.hello:Hello Angel}")
//    private String hello;
//
    @RequestMapping("/kitty")
    public String kitty(){

//        System.out.println("HelloController.helloJsp().hello="+hello);
//
//        map.put("hello",hello);

        return "index";

    }
//@RequestMapping("/xx")
////	@ResponseBody
//public String home() {
////    ModelAndView modelAndView=new ModelAndView();
////    modelAndView.setViewName("fileupload");
//    return "fileupload";
//}
//
////    @RequestMapping("kitty")
////    @ResponseBody
////    @Cacheable(key ="#p0")
////    public  List<userEntity> test(String id) throws Exception {
////        stringRedisTemplate.opsForValue().set(id, id);
////        String ss= stringRedisTemplate.opsForValue().get(id);
////        stringRedisTemplate.delete("aaa");
////        user use=new user();
////        use.setId(id);
////        use.setName("李");
////        use.setAge(22);
////        List list=new ArrayList();
////        System.out.println(Long.valueOf(id).longValue());
////        userEntity list=iuserinfoService.selectById(Long.valueOf(id).longValue());
////        List<userEntity> list=iuserinfoService.getList();
////        list.add("zhong");
////        list.add("ruan");
////        list.add("guo");
////        list.add("ji");
////        Map hashMap=new HashMap();
////        Map m = Collections.synchronizedMap(hashMap);
////        return list;
////
////    }
////    @RequestMapping("kitty2")
////    @ResponseBody
////    public  String  kitty2(String id) throws Exception {
////        stringRedisTemplate.opsForValue().set(id, id);
////        String ss= stringRedisTemplate.opsForValue().get(id);
////        stringRedisTemplate.delete("aaa");
//
////        user
////        use= (user) redisTemplate.opsForValue().get(id);
////        List list= (List) redisTemplate.opsForValue().get(id);
////        userEntity list=iuserinfoService.selectById(Long.valueOf(id).longValue());
////        Userfo list=userRepository.findByName("aaa");
////       String ss= iuserinfoService.selectById(Long.valueOf(id).longValue());
////        List<Userfo> list1=userRepository.findAll();
//
////        return ss;
////    }
//    @RequestMapping("delete")
////    @CacheEvict(key = "#p0")
//    @ResponseBody
//    public  List<userEntity> delete() throws Exception {
////  userEntity userEntity=new userEntity();
////  userEntity.setAge("777");
////  userEntity.setName("777 ");
////  userEntity.setPassword("123456");
////        userEntity.setId((long) 7);
////       int s= iBaseDao.add(userEntity);
////  userEntity.setId((long) 4);
////        iUserinfoRepository.save(userEntity);
////       iuserinfoService.deleteById(Long.valueOf(id).longValue());
////        iuserinfoService.add(userEntity);
////        iuserinfoService.deleteBytest(Long.valueOf(id).longValue());
////     iUserinfoRepository.deleteUser((long) 1);
//        System.out.println("---------------------------");
//        List<userEntity> s=  userRepository.findByName("ccc");
//        System.out.println("---------------------------");
////        userEntity s2=userRepository.findByName("ccc");
////        System.out.println(s+"----------");
////       userEntity userEntity= iBaseService.getById(1);
//
////        userRepository.saveAndFlush(userEntity);
//
//
//   return s;
//    }
//    @RequestMapping("update")
//    @ResponseBody
//
//    public Map update() throws Exception {
////        userEntity list=iuserinfoService.selectById(Long.valueOf(id).longValue());
////        list.setAge("300");
////        iuserinfoService.update(list);
//
//        userRepository.delete((long)4);
//        Map map=new HashMap();
//        map.put("hello","hello");
//        return map;
//    }
////    @RequestMapping("kitty1")
////    @ResponseBody
////    public void testObj() throws Exception {
////        user user=new user("11","haha",15);
////        ValueOperations<String, user> operations=redisTemplate.opsForValue();
////        operations.set("com2", user);
////        operations.set("com.f", user,100, TimeUnit.SECONDS);
////        Thread.sleep(1000);
////        //redisTemplate.delete("com.neo.f");
////        boolean exists=redisTemplate.hasKey("com.f");
////        if(exists){
////            System.out.println("exists is true");
////        }else{
////            System.out.println("exists is false");
////        }
////        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
////    }

}
