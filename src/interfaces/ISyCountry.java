/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.SyCountry;
import java.util.List;

/**
 *
 * @author 4f43L
 */
public interface ISyCountry {
    public void save(SyCountry country);

    public void update(SyCountry country);

    public void delete(SyCountry country);

    public List<SyCountry> read();

    public List<SyCountry> findById(String key);
}
