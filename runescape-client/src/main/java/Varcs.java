import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("ds")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("c")
   @Export("intsPersistence")
   boolean[] intsPersistence;
   @ObfuscatedName("x")
   @Export("map")
   Map map;
   /** @deprecated */
   @ObfuscatedName("h")
   @Export("strings")
   String[] strings;
   @ObfuscatedName("j")
   @Export("unwrittenChanges")
   boolean unwrittenChanges = false;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = 6607387257894408165L
   )
   long field1356;

   Varcs() {
      int var1 = class157.archive2.getGroupFileCount(19);
      this.map = new HashMap();
      this.intsPersistence = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
         VarcInt var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
            var4 = new VarcInt();
            if (var5 != null) {
               var4.method3459(new Buffer(var5));
            }

            VarcInt.VarcInt_cached.put(var4, (long)var2);
            var3 = var4;
         }

         this.intsPersistence[var2] = var3.persist;
      }

      var2 = 0;
      if (class157.archive2.method6298(15)) {
         var2 = class157.archive2.getGroupFileCount(15);
      }

      this.strings = new String[var2];
      this.read();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-14"
   )
   @Export("setInt")
   void setInt(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "32"
   )
   @Export("getInt")
   int getInt(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-930824979"
   )
   @Export("setString")
   void setString(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-26"
   )
   @Export("getString")
   String getString(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "2034530215"
   )
   @Export("setStringOld")
   void setStringOld(int var1, String var2) {
      this.strings[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1748116686"
   )
   @Export("getStringOld")
   String getStringOld(int var1) {
      return this.strings[var1];
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "126"
   )
   @Export("clearTransient")
   void clearTransient() {
      int var1;
      for(var1 = 0; var1 < this.intsPersistence.length; ++var1) {
         if (!this.intsPersistence[var1]) {
            this.map.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.strings.length; ++var1) {
         this.strings[var1] = null;
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lqv;",
      garbageValue = "1722935868"
   )
   @Export("getPreferencesFile")
   AccessFile getPreferencesFile(boolean var1) {
      return class156.getPreferencesFile("2", class376.field4411.name, var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1968826266"
   )
   @Export("write")
   void write() {
      AccessFile var1 = this.getPreferencesFile(true);

      try {
         int var2 = 3;
         int var3 = 0;
         Iterator var4 = this.map.entrySet().iterator();

         while(var4.hasNext()) {
            Map.Entry var5 = (Map.Entry)var4.next();
            int var6 = (Integer)var5.getKey();
            if (this.intsPersistence[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof String) {
                  var2 += Actor.stringCp1252NullTerminatedByteSize((String)var7);
               }

               ++var3;
            }
         }

         Buffer var23 = new Buffer(var2);
         var23.writeByte(2);
         var23.writeShort(var3);
         Iterator var24 = this.map.entrySet().iterator();

         while(var24.hasNext()) {
            Map.Entry var12 = (Map.Entry)var24.next();
            int var13 = (Integer)var12.getKey();
            if (this.intsPersistence[var13]) {
               var23.writeShort(var13);
               Object var8 = var12.getValue();
               class453 var9 = class453.method8255(var8.getClass());
               var23.writeByte(var9.field4832);
               class453.method8265(var8, var23);
            }
         }

         var1.write(var23.array, 0, var23.offset);
      } catch (Exception var21) {
      } finally {
         try {
            var1.close();
         } catch (Exception var20) {
         }

      }

      this.unwrittenChanges = false;
      this.field1356 = UserComparator8.method2748();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("read")
   void read() {
      AccessFile var1 = this.getPreferencesFile(false);

      try {
         byte[] var2 = new byte[(int)var1.length()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var1.read(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new EOFException();
            }
         }

         Buffer var14 = new Buffer(var2);
         if (var14.array.length - var14.offset < 1) {
            return;
         }

         int var15 = var14.readUnsignedByte();
         if (var15 < 0 || var15 > 2) {
            return;
         }

         int var7;
         int var8;
         int var9;
         int var16;
         if (var15 >= 2) {
            var16 = var14.readUnsignedShort();

            for(var7 = 0; var7 < var16; ++var7) {
               var8 = var14.readUnsignedShort();
               var9 = var14.readUnsignedByte();
               class453 var10 = (class453)WallDecoration.findEnumerated(class453.method8268(), var9);
               Object var11 = var10.method8257(var14);
               if (this.intsPersistence[var8]) {
                  this.map.put(var8, var11);
               }
            }
         } else {
            var16 = var14.readUnsignedShort();

            for(var7 = 0; var7 < var16; ++var7) {
               var8 = var14.readUnsignedShort();
               var9 = var14.readInt();
               if (this.intsPersistence[var8]) {
                  this.map.put(var8, var9);
               }
            }

            var7 = var14.readUnsignedShort();

            for(var8 = 0; var8 < var7; ++var8) {
               var14.readUnsignedShort();
               var14.readStringCp1252NullTerminated();
            }
         }
      } catch (Exception var25) {
      } finally {
         try {
            var1.close();
         } catch (Exception var24) {
         }

      }

      this.unwrittenChanges = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "82"
   )
   @Export("tryWrite")
   void tryWrite() {
      if (this.unwrittenChanges && this.field1356 < UserComparator8.method2748() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "4"
   )
   @Export("hasUnwrittenChanges")
   boolean hasUnwrittenChanges() {
      return this.unwrittenChanges;
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2015445151"
   )
   static final void method2612(int var0, int var1, int var2, int var3) {
      Client.overheadTextCount = 0;
      boolean var4 = false;
      int var5 = -1;
      int var6 = -1;
      int var7 = Players.Players_count;
      int[] var8 = Players.Players_indices;

      int var9;
      for(var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
         Object var20;
         if (var9 < var7) {
            var20 = Client.players[var8[var9]];
            if (var8[var9] == Client.combatTargetPlayerIndex) {
               var4 = true;
               var5 = var9;
               continue;
            }

            if (var20 == class296.localPlayer) {
               var6 = var9;
               continue;
            }
         } else {
            var20 = Client.npcs[Client.npcIndices[var9 - var7]];
         }

         class138.drawActor2d((Actor)var20, var9, var0, var1, var2, var3);
      }

      if (Client.renderSelf && var6 != -1) {
         class138.drawActor2d(class296.localPlayer, var6, var0, var1, var2, var3);
      }

      if (var4) {
         class138.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
      }

      for(var9 = 0; var9 < Client.overheadTextCount; ++var9) {
         int var10 = Client.overheadTextXs[var9];
         int var11 = Client.overheadTextYs[var9];
         int var12 = Client.overheadTextXOffsets[var9];
         int var13 = Client.overheadTextAscents[var9];
         boolean var14 = true;

         while(var14) {
            var14 = false;

            for(int var19 = 0; var19 < var9; ++var19) {
               if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXOffsets[var19] + Client.overheadTextXs[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) {
                  var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19];
                  var14 = true;
               }
            }
         }

         Client.viewportTempX = Client.overheadTextXs[var9];
         Client.viewportTempY = Client.overheadTextYs[var9] = var11;
         String var15 = Client.overheadText[var9];
         if (Client.chatEffects == 0) {
            int var16 = 16776960;
            if (Client.overheadTextColors[var9] < 6) {
               var16 = Client.field727[Client.overheadTextColors[var9]];
            }

            if (Client.overheadTextColors[var9] == 6) {
               var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.overheadTextColors[var9] == 7) {
               var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.overheadTextColors[var9] == 8) {
               var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
            }

            int var17;
            if (Client.overheadTextColors[var9] == 9) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = var17 * 1280 + 16711680;
               } else if (var17 < 100) {
                  var16 = 16776960 - (var17 - 50) * 327680;
               } else if (var17 < 150) {
                  var16 = (var17 - 100) * 5 + '\uff00';
               }
            }

            if (Client.overheadTextColors[var9] == 10) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = var17 * 5 + 16711680;
               } else if (var17 < 100) {
                  var16 = 16711935 - (var17 - 50) * 327680;
               } else if (var17 < 150) {
                  var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
               }
            }

            if (Client.overheadTextColors[var9] == 11) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               if (var17 < 50) {
                  var16 = 16777215 - var17 * 327685;
               } else if (var17 < 100) {
                  var16 = (var17 - 50) * 327685 + '\uff00';
               } else if (var17 < 150) {
                  var16 = 16777215 - (var17 - 100) * 327680;
               }
            }

            if (Client.overheadTextEffects[var9] == 0) {
               UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
            }

            if (Client.overheadTextEffects[var9] == 1) {
               UserComparator3.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var9] == 2) {
               UserComparator3.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
            }

            if (Client.overheadTextEffects[var9] == 3) {
               UserComparator3.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
            }

            if (Client.overheadTextEffects[var9] == 4) {
               var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (UserComparator3.fontBold12.stringWidth(var15) + 100) / 150;
               Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
               UserComparator3.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.overheadTextEffects[var9] == 5) {
               var17 = 150 - Client.overheadTextCyclesRemaining[var9];
               int var18 = 0;
               if (var17 < 25) {
                  var18 = var17 - 25;
               } else if (var17 > 125) {
                  var18 = var17 - 125;
               }

               Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - UserComparator3.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
               UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0);
               Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
         }
      }

   }
}
