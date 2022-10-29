import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
   @ObfuscatedName("a")
   @Export("javaVendor")
   public static String javaVendor;
   @ObfuscatedName("f")
   @Export("javaVersion")
   public static String javaVersion;
   @ObfuscatedName("r")
   public static short[] field1780;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lfy;"
   )
   @Export("current")
   Task current = null;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lfy;"
   )
   @Export("task")
   Task task = null;
   @ObfuscatedName("h")
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;I)Lfy;",
      garbageValue = "-1390753324"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)Lfy;",
      garbageValue = "1"
   )
   @Export("newSocketTask")
   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lfy;",
      garbageValue = "-24807431"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqk;B)V",
      garbageValue = "85"
   )
   static final void method3340(PacketBuffer var0) {
      int var1 = 0;
      var0.importIndex();

      byte[] var10000;
      int var2;
      int var4;
      int var5;
      for(var2 = 0; var2 < Players.Players_count; ++var2) {
         var5 = Players.Players_indices[var2];
         if ((Players.field1323[var5] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               var10000 = Players.field1323;
               var10000[var5] = (byte)(var10000[var5] | 2);
            } else {
               var4 = var0.readBits(1);
               if (var4 == 0) {
                  var1 = Interpreter.method2005(var0);
                  var10000 = Players.field1323;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  class71.readPlayerUpdate(var0, var5);
               }
            }
         }
      }

      var0.exportIndex();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.importIndex();

         for(var2 = 0; var2 < Players.Players_count; ++var2) {
            var5 = Players.Players_indices[var2];
            if ((Players.field1323[var5] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  var10000 = Players.field1323;
                  var10000[var5] = (byte)(var10000[var5] | 2);
               } else {
                  var4 = var0.readBits(1);
                  if (var4 == 0) {
                     var1 = Interpreter.method2005(var0);
                     var10000 = Players.field1323;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     class71.readPlayerUpdate(var0, var5);
                  }
               }
            }
         }

         var0.exportIndex();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.importIndex();

            for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
               var5 = Players.Players_emptyIndices[var2];
               if ((Players.field1323[var5] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     var10000 = Players.field1323;
                     var10000[var5] = (byte)(var10000[var5] | 2);
                  } else {
                     var4 = var0.readBits(1);
                     if (var4 == 0) {
                        var1 = Interpreter.method2005(var0);
                        var10000 = Players.field1323;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else if (class412.updateExternalPlayer(var0, var5)) {
                        var10000 = Players.field1323;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     }
                  }
               }
            }

            var0.exportIndex();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.importIndex();

               for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                  var5 = Players.Players_emptyIndices[var2];
                  if ((Players.field1323[var5] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        var10000 = Players.field1323;
                        var10000[var5] = (byte)(var10000[var5] | 2);
                     } else {
                        var4 = var0.readBits(1);
                        if (var4 == 0) {
                           var1 = Interpreter.method2005(var0);
                           var10000 = Players.field1323;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        } else if (class412.updateExternalPlayer(var0, var5)) {
                           var10000 = Players.field1323;
                           var10000[var5] = (byte)(var10000[var5] | 2);
                        }
                     }
                  }
               }

               var0.exportIndex();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  Players.Players_count = 0;
                  Players.Players_emptyIdxCount = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     var10000 = Players.field1323;
                     var10000[var2] = (byte)(var10000[var2] >> 1);
                     Player var3 = Client.players[var2];
                     if (var3 != null) {
                        Players.Players_indices[++Players.Players_count - 1] = var2;
                     } else {
                        Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }
}
