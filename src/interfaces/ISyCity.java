/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.SyCity;
import java.util.List;

/**
 *
 * @author 4f43L
 */
public interface ISyCity {

    public void save(SyCity city);

    public void update(SyCity city);

    public void delete(SyCity city);

    public List<SyCity> read();

    public List<SyCity> findById(String key);
}
