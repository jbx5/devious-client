import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gd")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("af")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("an")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("au")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("ab")
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1782899864"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;I)Lgp;",
      garbageValue = "1775674834"
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Lgp;",
      garbageValue = "-1731609371"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;IB)Lgp;",
      garbageValue = "0"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1616456716"
   )
   static int getClipMidX() {
      return Rasterizer3D.clips.field2795;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Lmr;",
      garbageValue = "2087958579"
   )
   public static StudioGame[] method3567() {
      return new StudioGame[]{StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape};
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-898403827"
   )
   static int method3561(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
         Interpreter.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (!Client.isCameraLocked) {
            Client.camAngleX = var3;
            Client.camAngleY = var4;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var3 < 0) {
            var3 = 0;
         }

         Client.camFollowHeight = var3;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
