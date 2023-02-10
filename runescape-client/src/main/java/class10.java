import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
public class class10 {
   @ObfuscatedName("tx")
   @ObfuscatedGetter(
      intValue = -427670217
   )
   static int field55;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   static Buffer field56;
   @ObfuscatedName("ft")
   @ObfuscatedGetter(
      intValue = -1048604885
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("f")
   final HttpsURLConnection field48;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   final class387 field49;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lk;"
   )
   final class9 field47;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   class428 field57;
   @ObfuscatedName("z")
   boolean field50;
   @ObfuscatedName("j")
   boolean field51;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1357961717
   )
   int field52;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lk;Lnx;Z)V"
   )
   public class10(URL var1, class9 var2, class387 var3, boolean var4) throws IOException {
      this.field50 = false;
      this.field51 = false;
      this.field52 = 300000;
      if (!var2.method92()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method80());
      } else {
         this.field48 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field48.setSSLSocketFactory(class15.method190());
         }

         this.field47 = var2;
         this.field49 = var3 != null ? var3 : new class387();
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lk;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      this(var1, var2, new class387(), var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lnx;",
      garbageValue = "977984904"
   )
   public class387 method100() {
      return this.field49;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lpm;I)V",
      garbageValue = "-564673124"
   )
   public void method96(class428 var1) {
      if (!this.field50) {
         if (var1 == null) {
            this.field49.method7418("Content-Type");
            this.field57 = null;
         } else {
            this.field57 = var1;
            if (this.field57.vmethod8059() != null) {
               this.field49.method7422(this.field57.vmethod8059());
            } else {
               this.field49.method7423();
            }

         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1395013465"
   )
   void method97() throws ProtocolException {
      if (!this.field50) {
         this.field48.setRequestMethod(this.field47.method80());
         this.field49.method7415(this.field48);
         if (this.field47.method84() && this.field57 != null) {
            this.field48.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field57.vmethod8061());
               var1.writeTo(this.field48.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.field48.setConnectTimeout(this.field52);
         this.field48.setInstanceFollowRedirects(this.field51);
         this.field50 = true;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1031693459"
   )
   boolean method103() throws IOException {
      if (!this.field50) {
         this.method97();
      }

      this.field48.connect();
      return this.field48.getResponseCode() == -1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)La;",
      garbageValue = "-711497669"
   )
   class20 method99() {
      try {
         if (!this.field50 || this.field48.getResponseCode() == -1) {
            return new class20("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field48.disconnect();
         return new class20("Error decoding REST response code: " + var10.getMessage());
      }

      class20 var3;
      try {
         class20 var1 = new class20(this.field48);
         return var1;
      } catch (IOException var8) {
         var3 = new class20("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field48.disconnect();
      }

      return var3;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-191772835"
   )
   static int method112(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == ScriptOpcodes.ADD) {
         class302.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 + var3;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         class302.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         class302.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 * var3;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         class302.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            class302.Interpreter_intStackSize -= 5;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | var4;
            return 1;
         } else if (var0 == 4016) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 < var4 ? var3 : var4;
            return 1;
         } else if (var0 == 4017) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 > var4 ? var3 : var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            class302.Interpreter_intStackSize -= 3;
            long var9 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            long var11 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            long var13 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var3 = class366.method7028(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            class302.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class152.method3307(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            class302.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.method6471(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            class302.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
            return 1;
         } else if (var0 == 4030) {
            class302.Interpreter_intStackSize -= 4;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3];
            var3 = ArchiveDiskActionHandler.method6471(var3, var5, var6);
            var7 = SoundCache.method871(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = NPC.method2679(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = class388.method7467(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            class302.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            var5 = Renderable.method4639(var3, var4);
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lgp;I)Z",
      garbageValue = "-1689076560"
   )
   static boolean method113(ObjectComposition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectComposition var4 = class463.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1554651935"
   )
   @Export("addNpcsToScene")
   static final void addNpcsToScene(boolean var0) {
      for(int var1 = 0; var1 < Client.npcCount; ++var1) {
         NPC var2 = Client.npcs[Client.npcIndices[var1]];
         if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field1163 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
                     continue;
                  }

                  Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
               }

               long var5 = ItemLayer.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
               var2.playerCycle = Client.cycle;
               WorldMapAreaData.scene.drawEntity(class103.Client_plane, var2.x, var2.y, GrandExchangeOfferNameComparator.getTileHeight(var2.field1163 * 64 - 64 + var2.x, var2.field1163 * 64 - 64 + var2.y, class103.Client_plane), var2.field1163 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
            }
         }
      }

   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "(Lcq;ZI)V",
      garbageValue = "1348971257"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1 && var2 != -1 && class431.Widget_loadedInterfaces[var2]) {
         UserComparator8.Widget_archive.clearFilesGroup(var2);
         if (WorldMapLabel.Widget_interfaceComponents[var2] != null) {
            boolean var4 = true;

            for(int var5 = 0; var5 < WorldMapLabel.Widget_interfaceComponents[var2].length; ++var5) {
               if (WorldMapLabel.Widget_interfaceComponents[var2][var5] != null) {
                  if (WorldMapLabel.Widget_interfaceComponents[var2][var5].type != 2) {
                     WorldMapLabel.Widget_interfaceComponents[var2][var5] = null;
                  } else {
                     var4 = false;
                  }
               }
            }

            if (var4) {
               WorldMapLabel.Widget_interfaceComponents[var2] = null;
            }

            class431.Widget_loadedInterfaces[var2] = false;
         }
      }

      GrandExchangeEvents.method6645(var2);
      Widget var6 = class133.getWidget(var3);
      if (var6 != null) {
         LoginScreenAnimation.invalidateWidget(var6);
      }

      if (Client.rootInterface != -1) {
         class147.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "1064424296"
   )
   static void method95(Buffer var0, int var1) {
      byte[] var2 = var0.array;
      if (Client.randomDatData == null) {
         Client.randomDatData = new byte[24];
      }

      class377.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
      Language.method6776(var0, var1);
   }
}
