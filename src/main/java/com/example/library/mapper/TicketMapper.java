package com.example.library.mapper;


import com.example.library.entity.Ticket;


import java.util.List;


public interface TicketMapper {
    /**
     *添加罚款信息
     * @param ticket
     * @return
     */
     int addTicket(Ticket ticket);

    /**
     * 查询所有罚款信息
     * @return
     */
   List<Ticket> queryAll();

    /**
     * 按照添加查询罚款
     * @param ticket
     * @return
     */
     List<Ticket> queryTicket(Ticket ticket);

    /**
     * 根据id批量删除罚款
     * @param id
     * @return
     */
     int deleteTicket(String[] id);

    /**
     * 根据ID删除一条罚款信息
     * @param ticket
     * */
    int deleteTicketByID(Ticket ticket);
    /**
     * 更新罚款信息
     */
     int updateTicket(Ticket ticket);

}
