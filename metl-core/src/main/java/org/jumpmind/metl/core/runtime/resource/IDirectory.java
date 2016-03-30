/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.metl.core.runtime.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface IDirectory {

    public boolean requiresContentLength();
    
    public void setContentLength(int length);
    
    public boolean supportsInputStream();
    
    public InputStream getInputStream(String relativePath, boolean mustExist);
    
    public InputStream getInputStream(String relativePath, boolean mustExist, boolean closeSession);
    
    public boolean supportsOutputStream();
    
    public OutputStream getOutputStream(String relativePath, boolean mustExist);

    public OutputStream getOutputStream(String relativePath, boolean mustExist, boolean closeSession);
    
    public void close();
    
    public boolean delete(String relativePath);
    
    public boolean delete(String relativePath, boolean closeSession);
    
    public boolean supportsDelete();
    
    public List<FileInfo> listFiles(String... relativePaths);    

    public List<FileInfo> listFiles(boolean closeSession, String... relativePaths);
    
    public FileInfo listFile (String relativePath);

    public FileInfo listFile(String relativePath, boolean closeSession);
    
    public void copyFile(String fromFilePath, String toFilePath);

    public void copyFile(String fromFilePath, String toFilePath, boolean closeSession);
    
    public void moveFile(String fromFilePath, String toFilePath);

    public void moveFile(String fromFilePath, String toFilePath, boolean closeSession);
    
    public void copyToDir(String fromFilePath, String toDirPath);

    public void copyToDir(String fromFilePath, String toDirPath, boolean closeSession);
    
    public void moveToDir(String fromFilePath, String toDirPath);

    public void moveToDir(String fromFilePath, String toDirPath, boolean closeSession);
    
    public boolean renameFile(String fromFilePath, String toFilePath);

    public boolean renameFile(String fromFilePath, String toFilePath, boolean closeSession);
    
    public void connect();
}
