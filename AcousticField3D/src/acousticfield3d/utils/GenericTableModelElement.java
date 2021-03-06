/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package acousticfield3d.utils;

/**
 *
 * @author Asier
 */
public interface GenericTableModelElement<E> {
    String[] getColumnNames();
    Class[] getColumnClasses();
    Object getObject(E element, int column);
    boolean setObject(E element, int column, Object object);
    boolean canEdit(int column);
}
