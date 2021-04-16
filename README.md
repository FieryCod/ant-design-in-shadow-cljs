
### Development mode
```
npm install
npx shadow-cljs watch app
```
start a ClojureScript REPL
```
npx shadow-cljs browser-repl
```

for webpack

``` sh
yarn webpack --watch
```

for scss compilation (I would love it to be handled by webpack as well)

``` sh
yarn scss:watch
```

### Building for production

```
npx shadow-cljs release app
```


