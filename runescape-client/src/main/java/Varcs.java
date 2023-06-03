import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = 1140429649
   )
   static int field1366;
   @ObfuscatedName("av")
   @Export("intsPersistence")
   boolean[] intsPersistence;
   @ObfuscatedName("as")
   @Export("map")
   Map map;
   /** @deprecated */
   @Deprecated
   @ObfuscatedName("ax")
   @Export("strings")
   String[] strings;
   @ObfuscatedName("ap")
   @Export("unwrittenChanges")
   boolean unwrittenChanges = false;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = -1995310396492266989L
   )
   long field1372;

   Varcs() {
      int var1 = MouseRecorder.archive2.getGroupFileCount(19);
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
               var4.method3613(new Buffer(var5));
            }

            VarcInt.VarcInt_cached.put(var4, (long)var2);
            var3 = var4;
         }

         this.intsPersistence[var2] = var3.persist;
      }

      var2 = 0;
      if (MouseRecorder.archive2.method6657(15)) {
         var2 = MouseRecorder.archive2.getGroupFileCount(15);
      }

      this.strings = new String[var2];
      this.read();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "985051977"
   )
   @Export("setInt")
   void setInt(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1651551854"
   )
   @Export("getInt")
   int getInt(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "32"
   )
   @Export("setString")
   void setString(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1825344050"
   )
   @Export("getString")
   String getString(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-2008147475"
   )
   @Export("setStringOld")
   void setStringOld(int var1, String var2) {
      this.strings[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1134556418"
   )
   @Export("getStringOld")
   String getStringOld(int var1) {
      return this.strings[var1];
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1003252827"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lsu;",
      garbageValue = "2"
   )
   @Export("getPreferencesFile")
   AccessFile getPreferencesFile(boolean var1) {
      return FontName.getPreferencesFile("2", GameBuild.field3841.name, var1);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1985334055"
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
                  var2 += Widget.stringCp1252NullTerminatedByteSize((String)var7);
               }

               ++var3;
            }
         }

         Buffer var28 = new Buffer(var2);
         var28.writeByte(2);
         var28.writeShort(var3);
         Iterator var29 = this.map.entrySet().iterator();

         label147:
         while(true) {
            Map.Entry var16;
            int var17;
            do {
               if (!var29.hasNext()) {
                  var1.write(var28.array, 0, var28.offset);
                  break label147;
               }

               var16 = (Map.Entry)var29.next();
               var17 = (Integer)var16.getKey();
            } while(!this.intsPersistence[var17]);

            var28.writeShort(var17);
            Object var8 = var16.getValue();
            Class var10 = var8.getClass();
            class490[] var11 = class490.method8761();
            int var12 = 0;

            class490 var9;
            while(true) {
               if (var12 >= var11.length) {
                  var9 = null;
                  break;
               }

               class490 var13 = var11[var12];
               if (var10 == var13.field4974) {
                  var9 = var13;
                  break;
               }

               ++var12;
            }

            var28.writeByte(var9.field4975);
            class486 var18 = class490.method8756(var8.getClass());
            var18.vmethod8774(var8, var28);
         }
      } catch (Exception var26) {
      } finally {
         try {
            var1.close();
         } catch (Exception var25) {
         }

      }

      this.unwrittenChanges = false;
      this.field1372 = BoundaryObject.method5027();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "189895418"
   )
   @Export("read")
   void read() {
      AccessFile var1 = this.getPreferencesFile(false);

      label245: {
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
                           break label245;
                        }

                        var8 = var14.readUnsignedShort();
                        var9 = var14.readUnsignedByte();
                        class490 var10 = (class490)GameObject.findEnumerated(class490.method8761(), var9);
                        Object var11 = var10.method8758(var14);
                        if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
                           this.map.put(var8, var11);
                        }

                        ++var7;
                     }
                  } else {
                     var16 = var14.readUnsignedShort();

                     for(var7 = 0; var7 < var16; ++var7) {
                        var8 = var14.readUnsignedShort();
                        var9 = var14.readInt();
                        if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
                           this.map.put(var8, var9);
                        }
                     }

                     var7 = var14.readUnsignedShort();
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label245;
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
            break label245;
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "125"
   )
   @Export("tryWrite")
   void tryWrite() {
      if (this.unwrittenChanges && this.field1372 < BoundaryObject.method5027() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-26"
   )
   @Export("hasUnwrittenChanges")
   boolean hasUnwrittenChanges() {
      return this.unwrittenChanges;
   }
}
