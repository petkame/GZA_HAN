/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2004, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * ---------------------
 * TimeSeriesDemo10.java
 * ---------------------
 * (C) Copyright 2003, 2004, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * $Id: TimeSeriesDemo10.java,v 1.10 2004/04/26 19:12:03 taqua Exp $
 *
 * Changes
 * -------
 * 21-Feb-2003 : Version 1 (DG);
 *
 */
//

package org.jfree.chart.demo;
//tutorial03 exam_10 참조(Layout 배치관련)
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A demo showing a time series with per minute data.
 *
 */
public class TimeSeriesDemo10 extends ApplicationFrame {

    /**
     * A demonstration application.
     *
     * @param title  the frame title.
     */
    public TimeSeriesDemo10(String title) {//

        
        
        
        //이하 JFreeChart 기본 설정항목들
    	super(title);
        TimeSeries series = new TimeSeries("Coin 가격", Minute.class);
        Hour hour = new Hour();
        series.add(new Minute(1, hour), 10.2);
        series.add(new Minute(3, hour), 17.3);
        series.add(new Minute(9, hour), 14.6);
        series.add(new Minute(11, hour), 11.9);
        series.add(new Minute(15, hour), 13.5);
        series.add(new Minute(19, hour), 10.9);
        final TimeSeriesCollection dataset = new TimeSeriesCollection(series);
        
        final JFreeChart chart = ChartFactory.createTimeSeriesChart(
            "Coin 시세 Chart",
            "시간순", 
            "단가",
            dataset,
            true,
            true,
            false
        );
        //chartPanel에 chart를 담음.
        ChartPanel cp = new ChartPanel(chart);
        cp.setPreferredSize(new java.awt.Dimension(500, 300));
        
        //Container c에 Contanepane 담기
        Container c = getContentPane();
        
        //container c의 Layout(Border 설정)
        c.setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1,1));//South배치용,Label(Login확인용)
        
        //jp1 생성 후 레이아웃 생성
        JPanel northP = new JPanel();
        northP.setLayout(new GridLayout(1,5));//North배치용,Label(Login확인용),JButton 2개 
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1,1));
        
        //jp 생성 후 cp를 담음
        
        JButton accountB = new JButton("회원가입");
        JButton loginB = new JButton("로그인");
        JLabel mainL = new JLabel();
        JLabel mainL1 = new JLabel(" 님 환영합니다.");
        JLabel mainL2 = new JLabel();
        
        jp.add(cp);
        
        //컴포넌트 부착 - jp1(하단)
        
        northP.add(mainL);
        northP.add(mainL1);
        northP.add(mainL2);
        northP.add(accountB);
        northP.add(loginB);
        
        c.add(jp,BorderLayout.WEST);
        c.add(northP,BorderLayout.NORTH);
        c.add(jp2,BorderLayout.EAST);
        
        //jb1 및 jp1 설정
        c.setSize(800,300);


    }

    // * http://www.object-refinery.com/jfreechart/guide.html                     *

    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {

        TimeSeriesDemo10 demo = new TimeSeriesDemo10("Main Page");
        
        demo.pack();
        //Frame 센터 설정
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
