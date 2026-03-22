package com.online.repository.Impl;

import com.online.Model.Overtime;
import com.online.repository.OvertimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class OvertimeRepositoryImpl implements OvertimeRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Overtime> getOvertime() {
        String sql="SELECT * FROM overtime";
        return jdbcTemplate.query(sql,
                (rs, rowNum) -> new Overtime(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3).toLocalDate(),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6)
                )
                );
    }

    @Override
    public Boolean addOvertime(Overtime overtime) {
        String sql = """
                        INSERT INTO overtime
                        (employeeId,date,hours,ratePerHour,totalAmount)
                        VALUE( ?,?,?,?,?,?)""";

        return jdbcTemplate.update(sql,
                    overtime.getEmployeeId(),
                    overtime.getDate(),
                    overtime.getHours(),
                    overtime.getRatePerHour(),
                    overtime.getTotalAmount()
                )>0;
    }

    @Override
    public Boolean updateOvertime(Overtime overtime) {
        String sql = "UPDATE overtime set employeeId = ?, date = ?, hours = ?, ratePerHour = ?, totalAmount = ? WHERE id = ? ";
        return jdbcTemplate.update(sql,
                          overtime.getEmployeeId(),
                          overtime.getDate(),
                          overtime.getRatePerHour(),
                          overtime.getTotalAmount()
                )>0;
    }

    @Override
    public void deleteOvertime(Integer id) {
        String sql = "DELETE FROM overtime WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
