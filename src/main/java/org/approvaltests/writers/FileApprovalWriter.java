package org.approvaltests.writers;

import java.io.File;

import org.approvaltests.core.ApprovalWriter;

import com.spun.util.io.FileUtils;

public class FileApprovalWriter implements ApprovalWriter
{
  private final File newFile;
  private String     extensionWithDot;
  public FileApprovalWriter(File newFile)
  {
    this.newFile = newFile;
    extensionWithDot = FileUtils.getExtensionWithDot(newFile.getName());
  }
  @Override
  public String writeReceivedFile(String received) throws Exception
  {
    return newFile.getAbsolutePath();
  }
  @Override
  public String getApprovalFilename(String base)
  {
    return base + Writer.approved + extensionWithDot;
  }
  @Override
  public String getReceivedFilename(String base)
  {
    return base + Writer.received + extensionWithDot;
  }
}
