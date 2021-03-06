/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.ADA.ProjectPanaderia.view;

import co.edu.usbbog.ADA.ProjectPanaderia.bo.ProductoBO;
import co.edu.usbbog.ADA.ProjectPanaderia.model.Producto;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian
 */
public class FormularioProducto extends javax.swing.JPanel {

    /**
     * Creates new form FormularioProducto
     */
    private ProductoBO pbo = new ProductoBO();
    private Menu me;

    public FormularioProducto(Menu m) {
        this.me = m;
        initComponents();
        listarProducto();
        calendario1.setDateFormatString("yyyy-MM-dd");
        calendario2.setDateFormatString("yyyy-MM-dd");
    }

    public void listarProducto() {
        pbo.listar(tabla);
    }

    public void limpiar() {
        txtNombre.setText("");
        txtMarca.setText("");
        txtId.setText("");
        txtCantidad.setText("");
        txtCosto.setText("");
        txtMedida.setText("");
        calendario1.setDate(null);
        calendario2.setDate(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        calendario1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calendario2 = new com.toedter.calendar.JDateChooser();
        agregarProducto = new javax.swing.JButton();
        borrarProducto = new javax.swing.JButton();
        verVentas = new javax.swing.JButton();
        modificarProducto = new javax.swing.JButton();
        verVentasPorFecha = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        limpiarCampos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        txtMedida = new javax.swing.JTextField();
        verReporteVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 102, 0));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marca");

        txtMarca.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        calendario1.setDateFormatString("yyyy-MM-dd");
        calendario1.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha vencimiento");

        jLabel4.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Costo");

        txtCosto.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Unidades vendidas");

        txtCantidad.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha venta");

        calendario2.setDateFormatString("yyyy-MM-dd");
        calendario2.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        agregarProducto.setBackground(new java.awt.Color(255, 102, 0));
        agregarProducto.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        agregarProducto.setText("Agregar venta");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });

        borrarProducto.setBackground(new java.awt.Color(255, 102, 0));
        borrarProducto.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        borrarProducto.setText("Borrar venta");
        borrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarProductoActionPerformed(evt);
            }
        });

        verVentas.setBackground(new java.awt.Color(255, 102, 0));
        verVentas.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        verVentas.setText("Ver ventas");
        verVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentasActionPerformed(evt);
            }
        });

        modificarProducto.setBackground(new java.awt.Color(255, 102, 0));
        modificarProducto.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        modificarProducto.setText("Modificar venta");
        modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProductoActionPerformed(evt);
            }
        });

        verVentasPorFecha.setBackground(new java.awt.Color(255, 102, 0));
        verVentasPorFecha.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        verVentasPorFecha.setText("Ver ventas por fecha");
        verVentasPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentasPorFechaActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID");

        limpiarCampos.setBackground(new java.awt.Color(255, 102, 0));
        limpiarCampos.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        limpiarCampos.setText("Limpiar campos");
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Medida");

        comboBox.setBackground(new java.awt.Color(255, 102, 0));
        comboBox.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramos", "Litros", "Gramos", "mililitros" }));

        txtMedida.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N

        verReporteVenta.setBackground(new java.awt.Color(255, 102, 0));
        verReporteVenta.setFont(new java.awt.Font("Honey Candy", 0, 24)); // NOI18N
        verReporteVenta.setText("Ver reporte venta");
        verReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReporteVentaActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(verVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verReporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verVentasPorFecha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calendario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarProducto)
                            .addComponent(verVentasPorFecha))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5))
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(calendario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(modificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        if (txtNombre.getText().isEmpty() || txtMarca.getText().isEmpty() || txtCantidad.getText().isEmpty()
                || txtId.getText().isEmpty() || calendario1.getDate() == null || calendario2.getDate() == null
                || txtCosto.getText().isEmpty() || Integer.parseInt(txtCantidad.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Error. Faltó ingresar datos o hay algún dato incorrecto");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Producto producto = new Producto();
            producto.setNombre(txtNombre.getText());
            producto.setMarca(txtMarca.getText());
            producto.setCantidad(Integer.parseInt(txtCantidad.getText()));
            producto.setId(Integer.parseInt(txtId.getText()));
            producto.setPeso(txtMedida.getText() + " " + comboBox.getSelectedItem().toString());
            producto.setFecha_vencimiento(Date.valueOf(sdf.format(calendario1.getDate())));
            producto.setCosto(Integer.parseInt(txtCosto.getText()));
            producto.setFecha_venta(Date.valueOf(sdf.format(calendario2.getDate())));
            String mensaje = pbo.crear(producto);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarProducto();
        }
    }//GEN-LAST:event_agregarProductoActionPerformed

    private void modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProductoActionPerformed
        if (txtNombre.getText().isEmpty() || txtMarca.getText().isEmpty() || txtCantidad.getText().isEmpty()
                || txtId.getText().isEmpty() || calendario1.getDate() == null || calendario2.getDate() == null
                || txtCosto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor. Llene todos los campos");
        } else {
            if (pbo.validacionProducto(Integer.parseInt(txtId.getText()))) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Producto producto = new Producto();
                producto.setNombre(txtNombre.getText());
                producto.setMarca(txtMarca.getText());
                producto.setCantidad(Integer.parseInt(txtCantidad.getText()));
                producto.setId(Integer.parseInt(txtId.getText()));
                producto.setPeso(txtMedida.getText() + " " + comboBox.getSelectedItem().toString());
                producto.setFecha_vencimiento(Date.valueOf(sdf.format(calendario1.getDate())));
                producto.setCosto(Integer.parseInt(txtCosto.getText()));
                producto.setFecha_venta(Date.valueOf(sdf.format(calendario2.getDate())));
                String mensaje = pbo.editar(producto);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarProducto();
            }else{
                JOptionPane.showMessageDialog(null, "No ha sido posible actualizar los datos. ID incorrecto.");
            }
        }
    }//GEN-LAST:event_modificarProductoActionPerformed

    private void borrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarProductoActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor. Llene el campo id del producto");
        } else {
            if (pbo.validacionProducto(Integer.parseInt(txtId.getText()))) {
                String mensaje = pbo.eliminar(Integer.parseInt(txtId.getText()));
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarProducto();
            } else {
                JOptionPane.showMessageDialog(null, "El producto no ha sido eliminado. El ID del producto no existe");
            }
        }
    }//GEN-LAST:event_borrarProductoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int seleccion = tabla.rowAtPoint(evt.getPoint());
        txtId.setText(tabla.getValueAt(seleccion, 0) + "");
        txtNombre.setText(tabla.getValueAt(seleccion, 1) + "");
        txtMarca.setText(tabla.getValueAt(seleccion, 2) + "");
        calendario1.setDate(Date.valueOf(tabla.getValueAt(seleccion, 3) + ""));
        txtCosto.setText(tabla.getValueAt(seleccion, 4) + "");
        txtCantidad.setText(tabla.getValueAt(seleccion, 5) + "");
        calendario2.setDate(Date.valueOf(tabla.getValueAt(seleccion, 7) + ""));
    }//GEN-LAST:event_tablaMouseClicked

    private void verVentasPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentasPorFechaActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (calendario2.getDate() != null) {
            pbo.listarProductos(tabla, Date.valueOf(sdf.format(calendario2.getDate())));
        } else {
            JOptionPane.showMessageDialog(null, "Por favor. Ingrese una fecha");
        }
    }//GEN-LAST:event_verVentasPorFechaActionPerformed

    private void verVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentasActionPerformed
        listarProducto();
    }//GEN-LAST:event_verVentasActionPerformed

    private void verReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReporteVentaActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (calendario2.getDate() != null) {
            pbo.listarReporte(tabla2, Date.valueOf(sdf.format(calendario2.getDate())));
        } else {
            JOptionPane.showMessageDialog(null, "Por favor. Ingrese una fecha");
        }
    }//GEN-LAST:event_verReporteVentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProducto;
    private javax.swing.JButton borrarProducto;
    private com.toedter.calendar.JDateChooser calendario1;
    private com.toedter.calendar.JDateChooser calendario2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton modificarProducto;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMedida;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton verReporteVenta;
    private javax.swing.JButton verVentas;
    private javax.swing.JButton verVentasPorFecha;
    // End of variables declaration//GEN-END:variables
}
