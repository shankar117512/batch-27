/**
 * project2: description
 * <p>
 * Copyright (C) user
 * <p>
 * This file is part of project2.
 * <p>
 * project2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * project2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with project2. If not, see <http://www.gnu.org/licenses/>.
 */


package devops2.tests.project2;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * @author user {@literal user@noreply.net}
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class TestSuite
{
    @BeforeClass
    public static void setup()
    {
        org.apache.log4j.ConsoleAppender appender = new org.apache.log4j.ConsoleAppender();
        appender.setWriter(new java.io.OutputStreamWriter(java.lang.System.out));
        appender.setLayout(new org.apache.log4j.PatternLayout("%-5p [%t]: %m%n"));
        org.apache.log4j.Logger.getRootLogger().addAppender(appender);
    }
}
