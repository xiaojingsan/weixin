//package com.example.library.controller;
//
//import com.example.library.entity.*;
//import com.example.library.service.BookService;
//import com.example.library.service.BorrowService;
//import com.example.library.service.PositionService;
//import com.example.library.service.UserService;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartUtilities;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//
//@Controller
//@RequestMapping("/borrow")
//public class BorrowController {
//    @Autowired
//     BorrowService borrowService;
//    @Autowired
//    UserService userService;
//    @Autowired
//    BookService bookService;
//    @Autowired
//    PositionService positionService;
//
//    /**
//     * 借书时首先要判断是否该用户可借(是本公司员工，是否有欠费)
//     *       其次要判断该书是否可借(该书是否在馆)
//     * */
//    @PostMapping("/borrowbook")
//    public void addBorrowRecord(Borrow borrow) {
//        borrow.setBorrowID(UUID.randomUUID().toString());
//        System.out.println("正在查询该图书");
//        User user= new User();
//        user.setUserID(borrow.getUserID());
//        List<User> list = userService.queryUser(user);
//
//        User u = list.get(0);
//        System.out.println(u+"借书人");
//
//        List<Book> list1 = bookService.selectBook(borrow.getBookName());
//        Book b = list1.get(0);
//        System.out.println(b+"书本");
//       if( b.getBookStatus().equals("在馆")){
//           borrow.setBookID(b.getBookID());
//           borrow.setUserID(u.getUserID());
//           borrow.setBorrowTime(new Date());
//           int n =  borrowService.addBorrowRecord(borrow);
//       }else{
//           return;
//       }
//       Position p = new Position();
//       p.setPositionID(null);
//       p.setBookID(b.getBookID());
//
//       List<Position>list3  =positionService.queryPosition(p);
//       System.out.println("正在删除"+list3.get(0));
//       positionService.deletePositionById(list3.get(0));
//        System.out.println("--------------------");
//        b.setBookStatus("已借出");
//        bookService.updateBook(b);
//        System.out.println("借书成功");
//
//    }
//    @GetMapping("/findallborrow")
//    @ResponseBody
//    public String  findAllBorrows(){
//        System.out.println("****************");
//       List<Borrow> list =  borrowService.findAllBorrowRecords();
//       list.forEach((p)->System.out.println(p));
//        System.out.println("****************");
//       return list.toString();
//    }
//    @PutMapping("/updateBorrow")
//    public String  updateBorrowRecord(Borrow borrow){
//        int n = borrowService.updateBorrowRecord(borrow);
//        Borrow bor = new Borrow();
//        bor.setBorrowID("1");
//       // Borrow b = borrowService.findAllBorrowRecords(user2).get(0);
////        StringBuilder sb = new StringBuilder();
////        sb.append(user.toString()+"   "+user1.toString());
//        //return sb.toString();
//        return null;
//    }
//
//    @PostMapping("/oneBorrow")
//    public String  queryBorrowRecords(Borrow borrow){
//        List<Borrow> list = new ArrayList<Borrow>();
//        System.out.println(borrow+"-------------");
//        list = borrowService.queryBorrowRecords(borrow);
//        return list.toString();
//    }
//
////    @GetMapping("/count")
////    public String  queryBorrowCount(){
////        List<BorrowCount> list = borrowService.queryBorrowCount();
////        System.out.println(list+"-------------");
////        list.forEach(p->System.out.println(p));
////        return list.toString();
////    }
//    @RequestMapping("/queryOut")
//    public ModelAndView queryOut(HttpServletRequest request) {
//        String[] names = borrowService.queryBookNameCount();
//        for (String name:names) {
//            System.out.println("++"+name);
//        }
//
//        int[] counts = borrowService.queryBookCount();
//        for (int count:counts) {
//            System.out.println("++"+count);
//        }
//        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
//        for (int i = 0; i < names.length; i++) {
//            String result = names[i];
//            System.out.print("++"+result+"*");
//            int num = counts[i];
//            System.out.print("++"+num+"*");
//            dataSet.setValue(num, result, result);
//        }
//        JFreeChart chart = ChartFactory.createBarChart("图书借阅统计图", "图书名", "数量",
//                dataSet, PlotOrientation.VERTICAL, true, true, true);
//
//        File file = new File("E:\\library\\src\\main\\resources\\static\\","report.jpg");
//        try {
//            ChartUtilities.saveChartAsJPEG(file, chart, 600, 400);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ModelAndView mv = new ModelAndView("redirect:/showdata.html");
//        return  mv;
//    }
//
//}
