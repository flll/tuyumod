#!/bin/bash
dir="."

# 置き換えたいファイル名を書いてください
# 各ペアに対して処理を行い、
# 二次元リストを増やすと尽きるまでループします
declare -A replace_pairs=(
  ["置き換えたいファイル名"]="置き換わるファイル名"
  ["examplemod.accesswidener"]="tuyumod.accesswidener"
  ["examplemod-common.mixins.json"]="tuyumod-common.mixins.json"
  ["ExampleMod.class"]="TuyuMod.class"
  ["ExampleExpectPlatformImpl.class"]="ExpectPlatformImpl.class"
  ["置き換えたいファイル名"]="置き換わるファイル名"
  ["置き換えたいファイル名"]="置き換わるファイル名"
)


for search_string in "${!replace_pairs[@]}"
do
  replace_string="${replace_pairs[$search_string]}"
  find "$dir" -type f -name "${search_string}" | while read old_file
  do
    # 新しいファイル名を生成します（search_string が replace_string に置き換えられます）
    new_file=${old_file//$search_string/$replace_string}
    mv "$old_file" "$new_file"
  done
done