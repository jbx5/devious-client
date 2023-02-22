import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("ac")
   @Export("intsPersistence")
   boolean[] intsPersistence;
   @ObfuscatedName("ab")
   @Export("map")
   Map map;
   /** @deprecated */
   @Deprecated
   @ObfuscatedName("an")
   @Export("strings")
   String[] strings;
   @ObfuscatedName("ao")
   @Export("unwrittenChanges")
   boolean unwrittenChanges = false;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      longValue = 283156368676865781L
   )
   long field1364;

   Varcs() {
      int var1 = class258.archive2.getGroupFileCount(19);
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
               var4.method3588(new Buffer(var5));
            }

            VarcInt.VarcInt_cached.put(var4, (long)var2);
            var3 = var4;
         }

         this.intsPersistence[var2] = var3.persist;
      }

      var2 = 0;
      if (class258.archive2.method6393(15)) {
         var2 = class258.archive2.getGroupFileCount(15);
      }

      this.strings = new String[var2];
      this.read();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "189351145"
   )
   @Export("setInt")
   void setInt(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "17769"
   )
   @Export("getInt")
   int getInt(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "106800955"
   )
   @Export("setString")
   void setString(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1782127200"
   )
   @Export("getString")
   String getString(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "113"
   )
   @Export("setStringOld")
   void setStringOld(int var1, String var2) {
      this.strings[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-81497682"
   )
   @Export("getStringOld")
   String getStringOld(int var1) {
      return this.strings[var1];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1424772556"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lre;",
      garbageValue = "20"
   )
   @Export("getPreferencesFile")
   AccessFile getPreferencesFile(boolean var1) {
      return class350.getPreferencesFile("2", DbTableType.field4870.name, var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "685094308"
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
                  var2 += WorldMapLabel.stringCp1252NullTerminatedByteSize((String)var7);
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
               class467 var9 = class467.method8473(var8.getClass());
               var23.writeByte(var9.field4862);
               class467.method8475(var8, var23);
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
      this.field1364 = WorldMapSection2.method4844();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-183595775"
   )
   @Export("read")
   void read() {
      AccessFile var1 = this.getPreferencesFile(false);

      label229: {
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
            if (var14.array.length - var14.offset >= 1) {
               int var15 = var14.readUnsignedByte();
               if (var15 >= 0 && var15 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var16;
                  if (var15 >= 2) {
                     var16 = var14.readUnsignedShort();
                     var7 = 0;

                     while(true) {
                        if (var7 >= var16) {
                           break label229;
                        }

                        var8 = var14.readUnsignedShort();
                        var9 = var14.readUnsignedByte();
                        class467 var10 = (class467)SpriteMask.findEnumerated(class467.method8480(), var9);
                        Object var11 = var10.method8465(var14);
                        if (this.intsPersistence[var8]) {
                           this.map.put(var8, var11);
                        }

                        ++var7;
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
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label229;
                        }

                        var14.readUnsignedShort();
                        var14.readStringCp1252NullTerminated();
                        ++var8;
                     }
                  }
               }

               return;
            }
         } catch (Exception var25) {
            break label229;
         } finally {
            try {
               var1.close();
            } catch (Exception var24) {
            }

         }

         return;
      }

      this.unwrittenChanges = false;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "295942057"
   )
   @Export("tryWrite")
   void tryWrite() {
      if (this.unwrittenChanges && this.field1364 < WorldMapSection2.method4844() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-90"
   )
   @Export("hasUnwrittenChanges")
   boolean hasUnwrittenChanges() {
      return this.unwrittenChanges;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-2118839909"
   )
   static final int method2717(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class137.method3080(var3, var5);
      int var8 = class137.method3080(var3 + 1, var5);
      int var9 = class137.method3080(var3, var5 + 1);
      int var10 = class137.method3080(var3 + 1, var5 + 1);
      int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
      int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
      int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
      int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
      int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
      int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
      return var15;
   }

   @ObfuscatedName("nd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1952675812"
   )
   static void method2724() {
      if (Client.oculusOrbState == 1) {
         Client.field553 = true;
      }

   }
}
