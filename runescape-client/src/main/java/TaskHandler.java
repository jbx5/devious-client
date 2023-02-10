import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("f")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("w")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lff;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lff;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("z")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("j")
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "28"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;B)Lff;",
      garbageValue = "110"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)Lff;",
      garbageValue = "1"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lff;",
      garbageValue = "-245767136"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lfp;",
      garbageValue = "513935047"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1182255807"
   )
   public static void method3475() {
      ItemComposition.ItemDefinition_cached.clear();
      ItemComposition.ItemDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }
}
