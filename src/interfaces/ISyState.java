/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.SyState;
import java.util.List;

/**
 *
 * @author 4f43L
 */
public interface ISyState {

    public void save(SyState state);

    public void update(SyState state);

    public void delete(SyState state);

    public List<SyState> read();

    public List<SyState> findById(String key);
}
