#!/bin/bash

# アイテム名のリスト
declare -a items=(
    "AppleSliceMoonItem"
    "AppleSliceRabbitItem"
    "AuroraBerry0Item"
    "AuroraBerry1Item"
    "AuroraBerry2Item"
    "AuroraBerry3Item"
    "BentoItem"
    "BentoLidItem"
    "ExampleItemItem"
    "GlassItem"
    "MiraclelessItem"
    "OmusubiNoriItem"
    "OmusubiTenmusuItem"
    "OnigiriNoriItem"
    "OnigiriUmeboshiItem"
    "OnirigiShioItem"
    "SandwichItem"
    "SandwichBerryItem"
    "ShrimpTempuraItem"
    "VoltagressOreItem"
)

for item in "${items[@]}"; do
  template="common/src/main/java/fish/lll/tuyumod/item/ShortcakeItem.java"
  outputFile="common/src/main/java/fish/lll/tuyumod/item/${item}.java"
  
  # ファイルが存在しない場合にのみ処理を実行
  if [ ! -f "$outputFile" ]; then
    # sedコマンドを使用してテンプレートの内容を置き換え、新しいファイルに出力
    sed "s>ShortcakeItem>${item}>g" "$template" > "$outputFile"
  else
    echo "${item}.java は既に存在しています。"
  fi
done
