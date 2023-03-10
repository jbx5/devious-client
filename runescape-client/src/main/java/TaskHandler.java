import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("tv")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("aj")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("al")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -2026807571
   )
   @Export("Client_plane")
   static int Client_plane;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lgf;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lgf;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("an")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("ao")
   @Export("isClosed")
   boolean isClosed = false;

   public TaskHandler() {
      javaVendor = "Unknown";
      javaVersion = "1.6";

      try {
         javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.isClosed = false;
      this.thread = new Thread(this);
      this.thread.setPriority(10);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "23"
   )
   @Export("close")
   public final void close() {
      synchronized(this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;I)Lgf;",
      garbageValue = "216202968"
   )
   @Export("newTask")
   final Task newTask(int var1, int var2, int var3, Object var4) {
      Task var5 = new Task();
      var5.type = var1;
      var5.intArgument = var2;
      var5.objectArgument = var4;
      synchronized(this) {
         if (this.task != null) {
            this.task.next = var5;
            this.task = var5;
         } else {
            this.task = this.current = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)Lgf;",
      garbageValue = "2"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lgf;",
      garbageValue = "572645137"
   )
   @Export("newThreadTask")
   public final Task newThreadTask(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         Task var1;
         synchronized(this) {
            while(true) {
               if (this.isClosed) {
                  return;
               }

               if (this.current != null) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }
         }

         try {
            int var5 = var1.type;
            if (var5 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (var5 == 4) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.status = 2;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lct;",
      garbageValue = "-127"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "881208565"
   )
   public static void method3460() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4162 != 0) {
            ArchiveDiskActionHandler.field4162 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var3) {
            }
         }

      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Lfl;",
      garbageValue = "-755195342"
   )
   static class134 method3458(int var0) {
      class134 var3 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
      class134 var2;
      class134 var4;
      AbstractArchive var5;
      AbstractArchive var6;
      boolean var7;
      byte[] var8;
      int var9;
      byte[] var10;
      if (var3 != null) {
         var2 = var3;
      } else {
         var5 = SequenceDefinition.SequenceDefinition_animationsArchive;
         var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
         var7 = true;
         var8 = var5.getFile(var0 >> 16 & '\uffff', var0 & '\uffff');
         if (var8 == null) {
            var7 = false;
            var4 = null;
         } else {
            var9 = (var8[1] & 255) << 8 | var8[2] & 255;
            var10 = var6.getFile(var9, 0);
            if (var10 == null) {
               var7 = false;
            }

            if (!var7) {
               var4 = null;
            } else {
               if (UserComparator7.field1413 == null) {
                  class134.field1573 = Runtime.getRuntime().availableProcessors();
                  UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class181());
               }

               try {
                  var4 = new class134(var5, var6, var0, false);
               } catch (Exception var13) {
                  var4 = null;
               }
            }
         }

         if (var4 != null) {
            SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
         }

         var2 = var4;
      }

      int var1;
      if (var2 == null) {
         var1 = 2;
      } else {
         var1 = var2.method3044() ? 0 : 1;
      }

      if (var1 != 0) {
         return null;
      } else {
         var3 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
         if (var3 != null) {
            var2 = var3;
         } else {
            var5 = SequenceDefinition.SequenceDefinition_animationsArchive;
            var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
            var7 = true;
            var8 = var5.getFile(var0 >> 16 & '\uffff', var0 & '\uffff');
            if (var8 == null) {
               var7 = false;
               var4 = null;
            } else {
               var9 = (var8[1] & 255) << 8 | var8[2] & 255;
               var10 = var6.getFile(var9, 0);
               if (var10 == null) {
                  var7 = false;
               }

               if (!var7) {
                  var4 = null;
               } else {
                  if (UserComparator7.field1413 == null) {
                     class134.field1573 = Runtime.getRuntime().availableProcessors();
                     UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class199());
                  }

                  try {
                     var4 = new class134(var5, var6, var0, false);
                  } catch (Exception var12) {
                     var4 = null;
                  }
               }
            }

            if (var4 != null) {
               SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
            }

            var2 = var4;
         }

         return var2;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "433390522"
   )
   public static void method3446() {
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1665222999"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = class36.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         class9.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      class18.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      class90.selectedSpellFlags = var2;
      class69.invalidateWidget(var4);
   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1645174054"
   )
   static void method3457(int var0) {
      ViewportMouse.tempMenuAction = new MenuAction();
      ViewportMouse.tempMenuAction.param0 = Client.menuArguments1[var0];
      ViewportMouse.tempMenuAction.param1 = Client.menuArguments2[var0];
      ViewportMouse.tempMenuAction.opcode = Client.menuOpcodes[var0];
      ViewportMouse.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      ViewportMouse.tempMenuAction.itemId = Client.menuItemIds[var0];
      ViewportMouse.tempMenuAction.action = Client.menuActions[var0];
      ViewportMouse.tempMenuAction.target = Client.menuTargets[var0];
   }
}
